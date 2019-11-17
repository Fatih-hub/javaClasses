package com.class12;

import java.util.Scanner;

public class ScanArray {

	public static void main(String[] args) {
		int[] array2= {2,4,3,7};
		int[] arr=new int[3];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		for(int b:arr) {
			System.out.print(b+" ");
		}
	}

}
