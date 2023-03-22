package com.learning.a2zcj.basics.patterns;

import java.util.Scanner;

public class Pattern39 {

	public static void main(String[] args) {
		/*
  -	- - - 1
  - - - 1 2
  - - 1 2 3
  - 1 2 3 4
  1 2 3 4 5
  - 1 2 3 4
  - - 1 2 3
  - - - 1 2
  - - - - 1
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
			
			System.out.println();
		}
		
		for(int x=1;x<=n-1;x++)
		{
			for(int y=1;y<=x;y++)
			{
				System.out.print(" "+ " ");
			}
			for(int y=n-x;y>0;y--)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}	
		
		
		
	}

}
