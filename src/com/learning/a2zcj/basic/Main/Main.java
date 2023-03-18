package com.learning.a2zcj.basic.Main;

import com.learning.a2zcj.basic.tasks.PrimeNumber;

public class Main {

	public static void main(String[] args) {
		
		PrimeNumber pn=new PrimeNumber();
		System.out.println(pn.isPrimeNumber(29));
		System.out.println(pn.isPrimeNumber(9));
		System.out.println(pn.isPrimeNumber(7));
		System.out.println(pn.isPrimeNumber(30));
		

	}

}
