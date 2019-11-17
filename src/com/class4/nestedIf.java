package com.class4;

public class nestedIf {

	public static void main(String[] args) {
		boolean b=false;
		boolean classToday=false;
		if(b) {
			System.out.println("Hello");
			if(classToday) {
				System.out.println("Hello my friends");
			}
		}else {
			System.out.println("Bye");
		}
	}

}
