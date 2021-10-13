package com.revature;

public class Main{


	public static void main(String[] args) {
		String str1 = "abcd", str2 = "dabc";
		
		boolean rotation = checkRotated(str1, str2);
		if(rotation) {
			System.out.printf("%b", rotation);
		}
		
	}

	public static boolean checkRotated(String str1, String str2) {
		StringBuilder combo1 = new StringBuilder(), combo2 = new StringBuilder();
		combo1.append(str1);
		combo1.append(str1);
		combo2.append(str2);
		combo2.append(str2);
		if(combo1.toString().contains(str2) && combo2.toString().contains(str1)) {
			return true;
		}
		return false;
	}
	
	
}
