package com.class6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * ask user to enter boolean value for sale
		 * if no sale-->I am not shopping
		 * if sale-->check the price of the item
		 * based on the amount we will have to calculate the price after discount
		 * if price <20-->apply 10%
		 * if price between 20-100-->20%
		 * if between 100-500-->30%
		 * anything-->50%
		 * After discount __the price of the item reduce from __to__
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter true/false for sale: ");
		boolean sale=sc.nextBoolean();
		int price=45;
		int price2=0;
		int discount=0;
		if(!sale) {
			System.out.println("I am not shopping.");
		}else {
			if(price<20) {
				discount=10;
				price2=price-(price*10/100);
			}else if(price>=20&&price<100){
				discount=20;
				price2=price-(price*20/100);
				
				
			}else if(price>=100&&price<500) {
				discount=30;
				price2=price-(price*30/100);
			}else {
				discount=50;
				price2=price-(price*50/100);
				
			}
			System.out.println("After discount %"+discount+" the price of the item reduce from "+price+" to "+price2);
		}

}
}
