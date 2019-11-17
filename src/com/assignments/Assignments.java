package com.assignments;

import java.util.Scanner;

public class Assignments {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		   
	    String gender=scan.nextLine();
	    
	    int age=scan.nextInt();
	    if(age>25){
	        if(gender.equals("F")){
	            System.out.println("Woman");
	            
	        }else if(gender.equals("M")){
	            System.out.println("Man");
	        }
	    }else if(age<25){
	        if(gender.equals("M")){
	            System.out.println("Boy");
	        }else if(gender.equals("F")){
	            System.out.println("Girl");
	        }
	    }
	}
	}


