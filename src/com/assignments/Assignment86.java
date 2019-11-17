package com.assignments;

public class Assignment86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum0=0;
		int sum1=0;
		int sum2=0;
		int sum3=0;
		int[][] a = {
			{1,1,2}, //sum = 4
			{3,1,2}, //sum = 6
			{3,5,3}, //sum = 11
			{0,1,2}  //sum = 3
		};
		
		  for(int b=0;b<3;b++){
		    sum0=sum0+a[0][b];
		    sum1=sum1+a[1][b];
		    sum2=sum2+a[2][b];
		    sum3=sum3+a[3][b];
		    
		    
		  }

		System.out.println(sum0);
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		
		

	}

}
