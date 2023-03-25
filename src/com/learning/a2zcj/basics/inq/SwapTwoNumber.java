package com.learning.a2zcj.basics.inq;

public class SwapTwoNumber {
	
	
	public void swapNumber(int number1,int number2) {
		System.out.println("Before swap: a = "+number1+" and b = "+number2);
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		
		System.out.println("After swap: a = "+number1+" and b = "+number2);
	}

}
