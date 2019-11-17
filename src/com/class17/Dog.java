package com.class17;

public class Dog {
	String breed, name, gender, color;
	int age, length;
	void bark() {
		System.out.println(breed+" barks");
	}
	void runs() {
		System.out.println(breed+" runs");
	}
	void sleeps() {
		System.out.println(breed+" sleeps 8 hours a day.");
	}
	public static void main(String[]args) {
		Dog dog1=new Dog();
		dog1.breed="Husky";
		dog1.name="Ruzgar";
		dog1.gender="male";
		dog1.color="White";
		dog1.age=3;
		dog1.length=3;

		System.out.println("-------------------");
		
		Dog dog2=new Dog();
		dog2.breed="Bulldog";
		dog2.name="Karabas";
		dog2.gender="female";
		dog2.color="black";
		dog2.age=4;
		dog2.length=3;
		
		System.out.println("--------------------");
		
		Dog dog3=new Dog();
		dog3.breed="Labrador";
		dog3.name="tom";
		dog3.gender="female";
		dog3.color="black";
		dog3.age=4;
		dog3.length=3;
		
		dog3.bark();
		

		
		
	}

}

