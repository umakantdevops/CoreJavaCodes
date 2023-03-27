package com.learning.a2zcj.basics.inq;

public class FindMaxNumber {

	public int getMaximuminTwoNumbers(int a,int b)
	{
		return a>b?a:b;
	}
	
	public int getMaximuminThreeNumbers(int a,int b,int c)
	{
		return (a>b)?(a>c?a:c):(b>c?b:c);
	}
	
	public int getMaximuminFourNumbers(int a,int b,int c,int d)
	{
		return (a>b)?(a>c?(a>d?a:d):(c>d)?c:d):(b>c?(b>d?b:d):(c>d?c:d));
	}
	
	
}
