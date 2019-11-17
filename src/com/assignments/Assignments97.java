package com.assignments;

import java.util.Scanner;

public class Assignments97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Using Scanner class input string value. 
Print out the following: "The first 3 letters of ___ is ___"

For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".

 */
		Scanner scan=new Scanner(System.in);
		String fruit=scan.nextLine();
		String fruit2=fruit.substring(0, 3);
		System.out.println("The first 3 letters of "+fruit+" is "+fruit2);

	}

}
