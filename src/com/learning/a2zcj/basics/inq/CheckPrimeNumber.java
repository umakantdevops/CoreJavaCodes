package com.learning.a2zcj.basics.inq;

public class CheckPrimeNumber {
	

	public boolean isPrimeNumber(int number) {
		
		int count=0;
		for(int i=1;i<=number;i++) {
			if(number%i==0)
			{
				count++;
			}
		}
		if(count==2) {
			return true;
		}else {
			return false;
		}
	}
}
