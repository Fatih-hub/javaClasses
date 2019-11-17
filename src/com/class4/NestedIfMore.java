package com.class4;

public class NestedIfMore {

	public static void main(String[] args) {
	
		int age=24;
		if(age<16) {
			System.out.println("You are too young to dirve");
			
		}else {
			System.out.println("You are eligible to drive");
			
			if(age>=18) {
				System.out.println("You can drive alone");
			}else {
				System.out.println("You need your parents to drive");
			}
		}
	}

}
