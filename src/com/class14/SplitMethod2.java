package com.class14;

public class SplitMethod2 {

	public static void main(String[] args) {
		//how many clause are there in the following string?
		//how to separate comma divided string
		
		String str="If you come to class early,"
				+ " then you can study more, "
				+ "then you can";
		String[] array=str.split(",");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i].trim());
			
		}
		String str1="Welcome To Syntax Technologies";
		String[] array2=str1.split(" ", 2);
		System.out.println(array2.length);

		for(int i=0;i<array2.length;i++) {
			System.out.println(array2[i]);
		}
	}

}
