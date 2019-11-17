package com.class17;

public class ObjectOfCarClass {
	public static void main(String[]args) {
		//to create an object syntax is
		//ClassName variable=new ClassName();
		//Scanner scan=new Scanner(System.in);
		//String str=new String();
		
		Car car1=new Car();
		car1.make="Tesla";
		car1.model="S3";
		car1.color="Black";
		car1.year=2020;
		car1.wheels=4;
		car1.speed=200;
		car1.start();
		car1.accelerate();
		car1.drive();
		System.out.println("------------------------");
		
		Car car2=new Car();
		car2.make="BMW";
		car2.model="I8";
		car2.color="White";
		car2.year=2019;
		car2.wheels=4;
		car2.speed=300;
		car2.start();
		car2.accelerate();
		car2.drive();
		
		//print the features of the car
		//say "I have a black Tesla"
		System.out.println("I have a "+car1.color+" "+car1.make);
		
	}

}
