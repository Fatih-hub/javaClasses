package com.class7;

public class WhileLoopPractice {

	public static void main(String[] args) {
		int a=50;
		
		while(a<=100) {
			if(a%2==1) {
				System.out.println(a);
				}
			a++;
		}
		System.out.println("########################################");
		int b=100;
		while(b>=1) {
			if(b%2==0) {
				System.out.println(b);
			}
			b--;
		}
	}

}
