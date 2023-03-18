package com.learning.a2zcj.basic.tasks;

import java.util.Scanner;

public class FabonicalSeries {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number, till which we want print : ");
		int n=sc.nextInt();
		int a=0,b=1,c=0;
		System.out.print(a+" "+b+" ");
		
		while(b<=n)
		{
			
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			
		}
		

	}

}
