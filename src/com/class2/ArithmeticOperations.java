package com.class2;

public class ArithmeticOperations {

	public static void main(String[] args) {
		/*
		 * declare 2 variables and initialize them
		 * display result of addition, subtraction, multiplication and division
		 */
		int num1, num2;
		
		num1=20;
		num2=10;
		System.out.println(num1+num2);//30
		System.out.println(num1-num2);//10
		System.out.println(num1*num2);//200
		System.out.println(num1/num2);//2
		
		//how can we print value of num1 and num2 together
		
		System.out.println(num1 +","+num2);
		
		int sum=num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		int division=num1/num2;
		//the addition of 2 numbers is __
		
		
		System.out.println("The addition of 2 numbers is "+sum+".");
		System.out.println("The subtraction of 2 numbers is "+sub+".");
		System.out.println("The multiplication of 2 numbers is "+mult+".");
		System.out.println("The division of 2 numbers is "+ division+".");
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(division);
		
		//modulus gives remaining of the division;
		
		int a=15;
		int b=2;
		int remainder=a%b;
		System.out.println(remainder);
		
		
		
	}

}
