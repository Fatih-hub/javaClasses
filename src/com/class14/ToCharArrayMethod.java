package com.class14;

public class ToCharArrayMethod {

	public static void main(String[] args) {
		// This method converts string to a new character array
		String str="Syntax";
		str.toCharArray();
		System.out.println(str.toCharArray());
		
		char[] array=str.toCharArray();
		
		for(char i:array) {
			System.out.println(i);
		}
		char b='w';
		char c='a';
		System.out.println(b+c);
		System.out.println(array);
		

	}

}
