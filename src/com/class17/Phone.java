package com.class17;

public class Phone {
	String Android, Nokia, model, brand;
	int year, memory;
	void lasts() {
		System.out.println(model+" lasts 10 hours");
	}
	void usage() {
		System.out.println(model+" is easy to use");
	}
	void brilliant() {
		System.out.println(model+"  is a very brilliant phone.");
	}

public static void main(String[]args) {
	
	Phone phone1=new Phone();
	phone1.year=2020;
	phone1.memory=128;
	phone1.brand="Nokia";
	phone1.model="3310";
	
	System.out.println("----------------------");
   
	Phone phone2=new Phone(); 
    phone2.year=2020;
	phone2.memory=128;
	phone2.brand="iPhone";
	phone2.model="X";
	
	System.out.println("________________________");
	
	Phone phone3=new Phone(); 
    phone3.year=2020;
	phone3.memory=128;
	phone3.brand="Android";
	phone3.model="Galaxy";
	
	phone3.usage();
	
}
}


