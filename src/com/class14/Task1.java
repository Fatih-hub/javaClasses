package com.class14;

public class Task1 {

	public static void main(String[] args) {
		String e="Today we have java class.";
		String b=e.replace(" ", "");
		System.out.println(b);
		
		//222222
		String c="asdflkajd0984*&#####^%";
		String d=c.replaceAll("[a-zA-Z0-9]","");
		System.out.println(d.length());
		
		//333333
		String a="Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] array=a.split("\\?");
		System.out.println(a.split("\\?").length);
		for(String string:array) {
			System.out.println(string.trim());
		}
	
	}

}
