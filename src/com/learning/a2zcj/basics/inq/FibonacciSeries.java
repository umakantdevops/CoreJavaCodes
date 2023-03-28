package com.learning.a2zcj.basics.inq;

public class FibonacciSeries {

	public void printFibonacciSeries(int endpoint) {
		int a=0,b=1;
		int sum=0;
		sum=a+b;
		System.out.print(a+ " "+b);
		while (sum<=endpoint) {
			System.out.print(" "+sum);
			a=b;
			b=sum;
			sum=a+b;
		}
	}
	
}
