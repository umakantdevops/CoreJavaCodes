package com.learning.a2zcj.basic.Main;

import com.learning.a2zcj.basics.inq.DuplicateCharacterInString;
import com.learning.a2zcj.basics.inq.FindMaxNumber;

public class Main {

	public static void main(String[] args) {
		
		FindMaxNumber fmn=new FindMaxNumber();
		System.out.println(fmn.getMaximuminTwoNumbers(6, 7));
		System.out.println(fmn.getMaximuminTwoNumbers(7, 6));
		System.out.println(fmn.getMaximuminThreeNumbers(10, 20, 30));
		System.out.println(fmn.getMaximuminThreeNumbers(30, 20, 10));
		System.out.println(fmn.getMaximuminThreeNumbers(20, 30, 10));
		System.out.println(fmn.getMaximuminFourNumbers(45, 50, 20, 60));
	}

}
