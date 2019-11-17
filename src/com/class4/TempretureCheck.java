package com.class4;

import java.util.Scanner;

public class TempretureCheck {

	public static void main(String[] args) {
		System.out.println("Enter the temperature in Fahrena");
		Scanner temperature1=new Scanner(System.in);
		int num1=temperature1.nextInt();
		System.out.println("Enter the city you live");
		Scanner city1=new Scanner(System.in);
		String name1=city1.nextLine();
		int convertedTemp=(num1-32)*5/9;
		System.out.println("The temperature in "+name1+" is "+convertedTemp);
	}

}
