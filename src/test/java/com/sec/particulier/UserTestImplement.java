package com.sec.particulier;

import com.sec.particulier.testInterfaces.UserTestInterface;

public class UserTestImplement implements UserTestInterface {

	@Override
	public boolean mailValidation(String email) {
		// TODO Auto-generated method stub
		int longueur=email.length();
		int positionat=email.indexOf("@");
		int positionpt=email.indexOf(".");
		if(email.isBlank())
		return false;
		else
		{
			if(positionpt>(longueur-2)||positionpt<0)
				return false;
			else if(positionat>(longueur-6)||positionat<0)
			return false;
			else return true;
		}
	}

	@Override
	public boolean passValidation(String password) {
		// TODO Auto-generated method stub
		int digits=0;
		int chars=0;
		char[] chaine=password.toCharArray();
		for(char c: chaine)
		{
			if(Character.isDigit(c))
			{
				digits++;
			}
			else if(Character.isAlphabetic(c))
			{
				chars++;
			}
		}
		if(digits>0 && chars>0)
		{
			if(digits+chars==password.length())
				return true;
			else
				// +216 99 333 444
				return false;
		}
		else
			return false;
		
	}

	@Override
	public boolean telValidation(String telephone) {
		// TODO Auto-generated method stub
		char[] chaine=telephone.toCharArray();
		boolean etat=true;
		if(chaine[0]!='+' || !Character.isDigit(chaine[0]))
			
		return false;
		else
		{
			for(int i=1;i<chaine.length-1;i++)
			{
				if(!Character.isDigit(chaine[i])|| chaine[i]!=' ')
				{
					etat=false;
					break;
				}
			}
			return etat;
			
			
		}
	}

	@Override
	public boolean ageValidation(int age) {
		// TODO Auto-generated method stub
		return age>18;
	}

}
