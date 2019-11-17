package com.class2;

public class MathInJava {

	public static void main(String[] args) {
		double decimalVar1, decimalVar2;
		decimalVar1=9.99;
		decimalVar2=4.56;
		double sum=decimalVar1+decimalVar2;
		double sub=decimalVar1-decimalVar2;
		double mult=decimalVar1*decimalVar2;
		double division=decimalVar1/decimalVar2;
		
		System.out.println("The addition of 2 numbers 9.99 and 4.56 is equal to "+ sum);
		System.out.println("The subtraction of 2 numbers 9.99 and 4.56 is equal to "+ sub);
		System.out.println("The multiplication of 2 numbers 9.99 and 4.56 is equal to "+ mult);
		System.out.println("The division of 2 numbers 9.99 and 4.56 is equal to "+ division);
		
		double task2;
		task2=3.9;
		double sqr=task2*task2;
		System.out.println("The square of the 3.9 is  "+ sqr);
		
		
		/*
		 * The perimeter of a rentangle with width __
		 * and height __ is equal to __ and the area is __
		 * 
		 */
		int width=5;
		int height=8;
		int perimeter=(width+height)*2;
		int area=width*height;
		System.out.println("The perimeter of a rectangle with width "+width+" and height "+height+" is equal to "+perimeter+" and the area is "+ area);
		String message="The perimeter of a rectangle with width "+width+" and height "+height+" is equal to "+perimeter+" and the area is "+ area;
		System.out.println(message);
		
		
	}

}
