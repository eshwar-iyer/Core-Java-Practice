package com.strings;

import java.security.DomainCombiner;

public class AddIntegersInStringFormat {

	
	public static void main(String[] args) {
		
		String str1 = "123";
		String str2 = "5678";
	
		int num1 = convertStringtoInt(str1);
		int num2 = convertStringtoInt(str2);
		
		System.out.println("The addition of the two numbers is " +  (num1 + num2));
		
	}
	
	public static int convertStringtoInt(String str) {
		int num = 0;
		int sign =1;
		int startIndex =0;
		
		
		// Check for negative sign
		
		if(str.charAt(0) == '-') {
			sign = -1;
			startIndex = 1;
		}
		
		//Iterate through each character of the String
		
		for(int i= startIndex; i < str.length(); i++) {
			int digit = str.charAt(i) - '0';
			num = num * 10 + digit;
		}

		//Apply the sign
		
		num = num * sign;
		return num;
	}
}
