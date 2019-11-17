package com.class4;

import java.util.Scanner;

public class DMV {

	public static void main(String[] args) {
		System.out.println("Enter your age");
		Scanner age1=new Scanner(System.in);
		int num1=age1.nextInt();
		if(num1>=18) {
			System.out.println("You are eligible to take a driver licence");
		}else if(18>num1&&num1>=16) {
			System.out.println("You just can take a driver's permit");
		}else {
			System.out.println("You are not eligible for driving a car");
		}
	}

}
