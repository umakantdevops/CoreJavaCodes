package com.learning.a2zcj.basics.inq;

public class CheckPalindrome {

	public boolean isNumberPalindrome(int number) {
		int nn=0,rem=0;
		int actualnumber=number;
		while (number>0) {
			rem=number%10;
			number=number/10;
			nn=(nn*10)+rem;

		}

		if(actualnumber==nn) {
			return true;
		}
		else {
			return false;
		}


	}

	public boolean isStringPalindrome(String string) {

		String actualstring=string;

		// have to revser string

		char[] actualarr=string.toCharArray();
		char[] revarr=new char[string.length()];

		for(int i=1;i<=string.length();i++)
		{
			revarr[string.length()-i]=actualarr[i-1];
		}
		String revString=new String(revarr);
		if(actualstring.equals(revString))
		{
			return true;
		}else {
			return false;
		}
	}
}
