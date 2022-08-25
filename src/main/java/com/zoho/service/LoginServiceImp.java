package com.zoho.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.entity.Login;
import com.zoho.repository.LoginRepository;

@Service
public class LoginServiceImp implements LoginService {
	@Autowired
	private LoginRepository loginrepo;

	@Override
	public Login verify(String email) {
		Login login = loginrepo.findByEmail(email);
		
		return login;
	}
}
