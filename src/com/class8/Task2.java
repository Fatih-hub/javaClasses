package com.class8;

public class Task2 {

	public static void main(String[] args) {
		int sumAllEven=0;
		int sumAllOdd=0;
		int a, b;
		for(a=0;a<=20;a+=2) {
			sumAllEven=sumAllEven+a;
		}
		for(b=1;b<=20;b+=2) {
			sumAllOdd=sumAllOdd+b;
		}
		System.out.println("sum for odd nums= "+sumAllOdd);
		System.out.println("sum for even nums= "+sumAllEven);
	}

}
