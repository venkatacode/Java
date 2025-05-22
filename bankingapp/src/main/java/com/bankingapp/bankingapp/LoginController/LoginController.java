package com.bankingapp.bankingapp.LoginController;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bankingapp.bankingapp.login.Credentials;
import com.bankingapp.bankingapp.logindto.CredentialsDto;
import com.bankingapp.bankingapp.loginservice.LoginService;

@RestController
@RequestMapping("/Wallet")
public class LoginController {

	@Autowired
	private LoginService lService;
	@Autowired
	private PasswordEncoder passwordEncoder;

	@PostMapping("/creation")
	public ResponseEntity<CredentialsDto> addCredentials(@RequestBody CredentialsDto creddto) {

		String encryptedPassword = passwordEncoder.encode(creddto.getPassword());
		creddto.setPassword(encryptedPassword);
		return ResponseEntity.ok(lService.create(creddto));
	}

	@PostMapping("/validate")
	public ResponseEntity<String> validate(@RequestBody CredentialsDto credentialsdto) {
		Long cust_id = credentialsdto.getCust_id();
		String password = credentialsdto.getPassword();
		Optional<Credentials> cred = lService.Login(cust_id, password);
		if (cred.isPresent()) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Successful");
		}
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid");

	}

	@PutMapping("/{cust_id}/deposit")
	public ResponseEntity<CredentialsDto> deposit(@PathVariable Long cust_id,
			@RequestBody Map<String, Double> request) {
		Double amount = request.get("amount");
		CredentialsDto creddto = lService.deposit(cust_id, amount);
		return ResponseEntity.ok(creddto);
	}

	@PutMapping("/{cust_id}/withdraw")
	public ResponseEntity<CredentialsDto> withdraw(@PathVariable Long cust_id,
			@RequestBody Map<String, Double> request) {
		Double amount = request.get("amount");
		CredentialsDto creddto = lService.withdraw(cust_id, amount);
		return ResponseEntity.ok(creddto);
	}

	@PutMapping("/{cust_id}/updatepassword")
	public ResponseEntity<String> Updatepassword(@PathVariable Long cust_id, @RequestBody Map<String, String> request) {
		String newPassword = request.get("newPassword");
		lService.Updatepassword(cust_id, newPassword);
		return ResponseEntity.ok("Password Updated");
	}

	@DeleteMapping("/{cust_id}")
	public ResponseEntity<String> Deactivate(@PathVariable Long cust_id) {
		lService.Deactivate(cust_id);
		return ResponseEntity.ok("Credentials Deactivated Successfully");
	}

	@GetMapping("/getAllCustomers/{cust_id}")
	public ResponseEntity<Object> getAllData() {
		return ResponseEntity.status(HttpStatus.OK).body(lService.getAll());
	}
}
