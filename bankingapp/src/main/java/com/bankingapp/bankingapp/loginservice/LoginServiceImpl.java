package com.bankingapp.bankingapp.loginservice;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.bankingapp.bankingapp.login.Credentials;
import com.bankingapp.bankingapp.logindto.CredentialsDto;
import com.bankingapp.bankingapp.loginrepository.LoginRepository;
import com.bankingapp.bankingapp.mapper.CredentialsMapper;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepository loginrepo;
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public CredentialsDto create(CredentialsDto credentialsdto) {

		Credentials cred = CredentialsMapper.mapToCredentials(credentialsdto);
		PasswordEncoder bcrypt=new BCryptPasswordEncoder();
		String encryptedPassword = bcrypt.encode(cred.getPassword());
		cred.setPassword(encryptedPassword);
		System.out.println(encryptedPassword);
		Credentials savecred = loginrepo.save(cred);
		return CredentialsMapper.mapToCredentialsDto(savecred);
	}

	public Optional<Credentials> Login(Long cust_id, String password) {
		Optional<Credentials> cred = loginrepo.findById(cust_id);
		String StoredPassword = cred.get().getPassword();
		//SCryptPasswordEncoder scrypt=new SCryptPasswordEncoder();
		PasswordEncoder bcrypt=new BCryptPasswordEncoder();
		//StandardPasswordEncoder spe=new StandardPasswordEncoder();
		//NoOpPasswordEncoder npe=new NoOpPasswordEncoder();
		//String encryptedPassword = spe.encode(password);
		//boolean passwordsmatch = passwordEncoder.matches(password, StoredPassword);
		System.out.println(StoredPassword);
		//System.out.println(encryptedPassword);
		System.out.println(password);
		if (bcrypt.matches(password,StoredPassword)){
			return cred;
		}
		return cred.empty();
	}

	public CredentialsDto deposit(Long cust_id, double amount) {
		Credentials cred = loginrepo.findById(cust_id).orElseThrow(() -> new RuntimeException("Invalid Id"));
		double total = cred.getBalance() + amount;
		cred.setBalance(total);
		Credentials savedcred = loginrepo.save(cred);
		return CredentialsMapper.mapToCredentialsDto(savedcred);

	}

	public CredentialsDto withdraw(Long cust_id, double amount) {
		Credentials cred = loginrepo.findById(cust_id).orElseThrow(() -> new RuntimeException("Invalid Id"));
		if (cred.getBalance() < amount) {
			throw new RuntimeException("InSufficient Funds");
		}
		double total = cred.getBalance() - amount;
		cred.setBalance(total);
		Credentials savedcred = loginrepo.save(cred);
		return CredentialsMapper.mapToCredentialsDto(savedcred);
	}

	public void Deactivate(Long cust_id) {
		Credentials cred = loginrepo.findById(cust_id).orElseThrow(() -> new RuntimeException(""));
		loginrepo.deleteById(cust_id);
	}

	public void Updatepassword(Long cust_id, String newPassword) {
		Credentials cred = loginrepo.findById(cust_id).orElseThrow(() -> new RuntimeException("Invalid Id"));
		if (newPassword != null && !BCrypt.checkpw(newPassword, cred.getPassword())) {
			PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			String encodedPassword = passwordEncoder.encode(newPassword);
			cred.setPassword(encodedPassword);
			System.out.println(newPassword);
			System.out.println(encodedPassword);
			loginrepo.save(cred);
		} else {
			throw new RuntimeException("Old password must not be new password");
		}
	}

	public List<Credentials> getAll() {
		return loginrepo.findAll();
	}
}
