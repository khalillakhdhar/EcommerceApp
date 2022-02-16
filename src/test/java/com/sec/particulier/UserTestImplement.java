package com.sec.particulier;

import com.sec.particulier.testInterfaces.UserTestInterface;

public class UserTestImplement implements UserTestInterface {

	@Override
	public boolean mailValidation(String email) {
		
		return false;
	}

	@Override
	public boolean passValidation(String password) {
		String ch;
		if(password.length()>8) && (charactar.isDigit(ch))
			return true;
		else
			return false;
		
	}

	@Override
	public boolean telValidation(String telephone) {
		if (telephone.length()>8)
		   return true;
		else 
			return false;
	}

	@Override
	public boolean ageValidation(int age) {
		if (age >=18)
		return true;	
		else	
		return false;
	}

}
