package com.strings;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateCharInAString {

	public static void main(String[] args) {

		String str = "abababoijoojoj0u-[p0eikdshfjshdfo";
		
		Map charMap = new HashMap<String, Object>();
		
		str.chars().forEach( c -> charMap.put(String.valueOf((char)c), null));
		System.out.println(charMap.keySet());
	}
}
