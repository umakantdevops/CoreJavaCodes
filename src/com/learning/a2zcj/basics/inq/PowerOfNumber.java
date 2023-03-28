package com.learning.a2zcj.basics.inq;

public class PowerOfNumber {

	public int getPowerOfInteger(int a,int b)
	{
		int pow=1;
		for(int i=1;i<=b;i++)
		{
			pow=pow*a;
		}
		return pow;
	}
	
}
