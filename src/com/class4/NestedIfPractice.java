package com.class4;

public class NestedIfPractice {
	public static void main(String[]args) {
		boolean isFriday=true;
		int day=130;
		if(isFriday)  {
			System.out.println("Today is friday");
			if(day==13) {
				System.out.println("I will watch scary movie");
			}
		}else {
			System.out.println("Today is not friday");
		}
	}

}
