package com.revature.service;

import com.revature.beans.Credentials;
import com.revature.beans.Employees;

public class AuthenticationService {

	public AuthenticationService() {
	}
	
	public Employees isValidUser(Credentials credentials) {
		Employees e = null;
		String firstname = credentials.getfirstname();
		String password = credentials.getPassword();
		//this is Authentication (does user exist in system?)
		//now Authorization (what can the user access within the system?) (user roles)
		//take credentials and return the Employee to which they belong if it exists
		if (firstname != null && password != null) {
			
		}
		return e;
	}

}