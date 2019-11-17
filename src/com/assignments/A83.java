package com.assignments;

public class A83 {

	public static void main(String[] args) {
		
		int[][] a = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
			};
		
		
		
		int max=a[0][0];
		for(int b=0;b<3;b++) {
			for(int c=0;c<4;c++) {
				
				if(max<a[b][c]) {
					max=a[b][c];
				}
			}
		}
		System.out.println(max);
			
	}

}
