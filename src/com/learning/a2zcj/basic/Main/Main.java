package com.learning.a2zcj.basic.Main;

import com.learning.a2zcj.basics.inq.CheckPalindrome;

public class Main {

	public static void main(String[] args) {
		
		CheckPalindrome cp=new CheckPalindrome();
		System.out.println(cp.isNumberPalindrome(12321));
		System.out.println(cp.isNumberPalindrome(123432));
		System.out.println(cp.isStringPalindrome("NITIN"));
		System.out.println(cp.isStringPalindrome("NIPUN"));

	}

}
