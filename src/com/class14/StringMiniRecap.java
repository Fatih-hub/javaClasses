package com.class14;

public class StringMiniRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("Hello");
		System.out.println(str);
		String str2=str.replaceAll("Hello", "Bye");
		System.out.println(str2);
		System.out.println("***********************");
		
		
		
		/*
		 * This is a common interview question.They ask you the reason for 
		 * change in the output
		 */
		
		String str4=new String("Hello!");
		String str3=new String("Hello!");
		System.out.println(str4==str3);
		String s1="Hello";
		String s2="Hello";
		System.out.println(s1==s2);

	}

}
