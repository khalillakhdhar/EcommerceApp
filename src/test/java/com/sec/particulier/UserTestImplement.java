package com.sec.particulier;

import com.sec.particulier.testInterfaces.UserTestInterface;

public class UserTestImplement implements UserTestInterface {

	@Override
	public boolean mailValidation(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean passValidation(String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean telValidation(String telephone) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ageValidation(int age) {
		// TODO Auto-generated method stub
		return false;
	}

}
