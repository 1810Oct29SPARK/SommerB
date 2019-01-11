package com.revature.service;

import com.revature.beans.Credentials;
import com.revature.beans.Employees;

public class AuthenticationService {

	public AuthenticationService() {
	}
	
	public Employees isValidUser(Credentials credentials) {
		Employees e = null;
		String username = credentials.getUsername();
		String password = credentials.getPassword();
		//this is Authentication (does user exist in system?)
		//now Authorization (what can the user access within the system?) (user roles)
		//take credentials and return the Employee to which they belong if it exists
		if (username != null && password != null) {
			
		}
		return e;
	}

}