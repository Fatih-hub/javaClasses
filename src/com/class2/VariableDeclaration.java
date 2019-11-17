package com.class2;

public class VariableDeclaration {

	public static void main(String[] args) {
		//1. declaring variable num1 that will hold value of int and 
		//assign value of 123 to it
		int num1=123;
		int num2=6767;
		int num3=787878;
		
		//2. declare variable first and then assign value
		int n1;
		int n2; 
		int n3;
		
		n1=56;
		n2=7676;
		n3=565;
		//3. declaring variables all together
		//this will work if your all variables are the same type
		
		int number1, number2, number3;
		number1=12;
		number2=15;
		number3=4544;
		//System.out.println(number3);
		number3=1000;
		System.out.println(number3);
		
		boolean var=true;
		System.out.println(var);
		
		char myVariable;
		myVariable='*';
		System.out.println(myVariable);
		
		number1=number2;
		System.out.println(number2);
		/*
		 * From the previous code we understood that the right side of the equation 
		 * is the one who doesnt change, but the left side is changed by the rifgt side`s value
		 * 
		 */
		
		//number2=false;-->compile error asking to change datatype of variable
		//number2 to boolean
		
		boolean isRain=false;
		boolean isSnow;
		isSnow=isRain;
		System.out.println(isRain);
		isRain=true;
		isSnow=true;
		
		
	}

}
