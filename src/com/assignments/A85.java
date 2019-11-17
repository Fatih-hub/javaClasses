package com.assignments;

public class A85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = {
				{1,1,1},
				{1,1,1},
				{1,1,1}
			};
		boolean t=true;
		for(int i=0;i<a.length;i++) {
			if(a.length==a[i].length) {
				t=true;
			}else {
				t=false;
			}
		}
		System.out.println(t);
	}

}
