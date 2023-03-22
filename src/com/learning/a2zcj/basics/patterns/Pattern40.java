package com.learning.a2zcj.basics.patterns;

import java.util.Scanner;

public class Pattern40 {

	public static void main(String[] args) {
		/*
		 *  1       1     
	      1 2 1
	    1 2 3 2 1
	  1 2 3 4 3 2 1
	1 2 3 4 5 4 3 2 1
	  1 2 3 4 3 2 1
	    1 2 3 2 1
	      1 2 1
	        1
		 */

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit : ");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			for(int j=n-i;j>0;j--)
			{
				System.out.print(" "+ " ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print(j+" ");
			}
			
			System.out.println();
		}

		for(int x=1;x<=n-1;x++)
		{
			for(int y=1;y<=x;y++)
			{
				System.out.print(" "+ " ");
			}
			for(int y=1;y<=n-x;y++)
			{
				System.out.print(y+" ");
			}
			for(int y=n-1-x;y>0;y--)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}	

	}

}
