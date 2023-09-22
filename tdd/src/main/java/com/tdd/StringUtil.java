package com.tdd;

public class StringUtil {
	
	
	public static String truncateHeader(String input, int headerLimit) {
		if(input.length()>headerLimit) {
			return new StringBuffer(input.substring(0, headerLimit)).append("...").toString();  
		}
		else {
			return input;
		}
	}

}
