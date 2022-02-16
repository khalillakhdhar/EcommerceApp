package com.sec.particulier;

import com.sec.particulier.testInterfaces.UserTestInterface;

public class UserTestImplement implements UserTestInterface {

	@Override
	public boolean mailValidation(String email) {
		// TODO Auto-generated method stub
		if(email.length()<10)
			return false;
		else  {
			return (email.contains("@")&&email.lastIndexOf("@")<email.length()-2) && (email.contains(".")&&email.lastIndexOf(".")<email.length()-3);
		}
		
	}

	@Override
	public boolean passValidation(String password) {
		// TODO Auto-generated method stub
		 
        if (password.length() <8) {
            return false;
        }
        
        if (password.contains("@") || password.contains("#")){
        	return false;
        }
        
 
        
        if (true) {
            int count = 0;
 
         
            for (int i = 0; i <= 9; i++) {
 
                
                String str1 = Integer.toString(i);
 
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
        if (true) {
            int count = 0;
 
            
            for (int i = 65; i <= 90; i++) {
 
                
                char c = (char)i;
 
                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
        
        if (true) {
            int count = 0;
 
          
            for (int i = 90; i <= 122; i++) {
 
                
                char c = (char)i;
                String str1 = Character.toString(c);
 
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
        return true;
        }
	@Override
	public boolean telValidation(String telephone) {
		return telephone.length()>8;
		
	}

	@Override
	public boolean ageValidation(int age) {
		// TODO Auto-generated method stub
		return age>0;
	}

}
