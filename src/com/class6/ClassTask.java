package com.class6;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the month you were born");
		String month=scan.nextLine();
		String season;
		if(month.equals("Jan")||month.equals("Feb")||month.equals("Dec")) {
			season="Winter";
		}else if(month.contentEquals("March")||month.equals("April")||month.contentEquals("May")) {
			season="Spring";
			
		}else if(month.contentEquals("June")||month.equals("July")||month.contentEquals("August")) {
			season="Summer";
		}else if(month.contentEquals("Sep")||month.equals("Oct")||month.contentEquals("Nov")) {
			season="Fall";
		}else {
			season="Unknown";
		}
		System.out.println("You were born in "+season);
	}
}
