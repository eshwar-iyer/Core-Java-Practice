package com.strings;

import java.util.HashMap;
import java.util.Map;

public class FindNumberOfOccurrencesOfACharInAString {

	public static void main(String[] args) {
		
		
		String str = "rrrrttyyy123sdfgdfgfdgdfgasdff";
		
		HashMap<Character,Integer> charMap = new HashMap<Character,Integer>();
		
		for(char c: str.toCharArray()) {
			
			if(charMap.containsKey(c)) {
				charMap.put(c, (charMap.get(c) + 1));
			}else {
				charMap.put(c, 1);
			}
		}
		
		System.out.println(charMap.toString());
		

	}

}
