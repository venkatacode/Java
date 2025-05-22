package com.bankingapp.bankingapp.mapper;

import com.bankingapp.bankingapp.login.Credentials;
import com.bankingapp.bankingapp.logindto.CredentialsDto;

public class CredentialsMapper {

	public static Credentials mapToCredentials(CredentialsDto credentialsdto) {
		Credentials cred = new Credentials(credentialsdto.getCust_id(), credentialsdto.getCust_name(),
				credentialsdto.getPassword(), credentialsdto.getBalance());

		return cred;

	}

	public static CredentialsDto mapToCredentialsDto(Credentials credentials) {
		CredentialsDto creddto = new CredentialsDto(credentials.getCust_id(), credentials.getCust_name(),
				credentials.getPassword(), credentials.getBalance());

		return creddto;

	}

}
