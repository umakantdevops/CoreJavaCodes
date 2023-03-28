package com.learning.a2zcj.basics.inq;

public class CheckArmstrongNumber {

	
	public boolean isArmstromgNumber(int number)
	{
		int total=0,actual=number;
		int rem;
		while(number>0)
		{
			rem=number%10;
			total=total+getCube(rem);
			number=number/10;
		}
		if(actual==total)
		{
			return true;
		}
		else {
			return false;	
		}
	}
			
	public static int getCube(int a) {
			return a*a*a;
	}
	
}
