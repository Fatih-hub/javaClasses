package com.class11;

public class Task3 {

	public static void main(String[] args) {
	//create an array of countries while retrieving all values from an array print capital for each country(use two different loops)	

		String[] countries= {"Turkey", "The USA","England", "France", "Spain"};
		
		String[] capitals= {"Istanbul","DC","London","Paris","Madrid"};
		for(int i=0;i<=4;i++) {
				System.out.println("The capital city of "+countries[i]+" is "+capitals[i]);
		}
		
}
}