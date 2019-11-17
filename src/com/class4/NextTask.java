package com.class4;

import java.util.Scanner;

public class NextTask {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System.out.println("What is the amount of loan is needed");
		int num1=keyboard.nextInt();
		if(num1<200000) {
			System.out.println("We can do it");
			
		}else {
			System.out.println("We can not do it");
		}
	}
	

}
