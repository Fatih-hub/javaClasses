package com.class6;

import java.util.Scanner;

public class replAssingments2 {

	public static void main(String[] args) {
		 String eligibility="Unknown";
		    Scanner scan=new Scanner(System.in);
		    System.out.println("Do you need a loan?");
		    boolean answer=scan.nextBoolean();
		    if(answer){
		      System.out.println("What is your credit score?");
		      int creditScore=scan.nextInt();
		      if(creditScore<600){
		        eligibility="Not eligible";
		      }else if(creditScore>600&&creditScore<=700){
		       eligibility="Maybe eligible";
		      }else if(creditScore>701&&creditScore<=800){
		        eligibility="Eligible";
		      }else if(creditScore>800){
		        eligibility="Definitely eligible";
		      }
		      }else {
		    	  
		      }
		    System.out.println("The eligibility is "+eligibility);
		
		
	}

}
