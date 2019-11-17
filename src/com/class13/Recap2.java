package com.class13;

public class Recap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Hello";
		String str2="Hello";
		String str3=new String("Bye");
		String str4=new String("Bye");
		System.out.println("Appreciate it");
		System.out.println(str3==str4);
		System.out.println(str1==str2);
		String str5="Today is Saturday";
		System.out.println(str5.startsWith("Today"));
		System.out.println(str5.endsWith("day"));
		System.out.println(str5.concat(" and we have java class"));

	}

}
