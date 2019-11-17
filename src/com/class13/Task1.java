package com.class13;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String day=scanner.nextLine();
		if(day.toLowerCase().equals("saturday")) {
			System.out.println("Saturday is your Java Class");
		}else if(day.equals("sunday")) {
			System.out.println("Sunday is your Git Class");
		}else if(day.toLowerCase().equals("TUESDAY")) {
			System.out.println("Tuesday is your SDLC class");
		}else if(day.equals("thurday")) {
			System.out.println("Thurday is your Manual Testing class");
		}else {
			System.err.println("Invalid Entry!!Please enter a valid class day");
		}
		scanner.close();
		

	}
	

}
