package com.class14;

public class SplitMethod {

	public static void main(String[] args) {
		
		/*
		 * .split()
		 * This method splits this string around matches of the given regular expressions
		 */
		String str="Video provides a powerful way to help you prove your point.\n";
		String[] array=str.split(" ");
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		//How can I find how many sentences are in the following string
		String str1="Today is Sunday. Its sunny day. and we are having java class";
		String[] array2=str1.split("\\.");
		for(String string:array2) {
			System.out.println(string.trim());
		}
	

	}

}
