package com.assignments;

public class Assignments87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int sum=0;
			int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
			for(int i=0;i<3;i++){
			  for(int b=0;b<4;b++){
			    if(a[i][b]%2==-1&&a[i][b]<0){
			      sum=sum+1;
			      
			      
			    }
			  }
			}
			System.out.println(sum);
	}

}
