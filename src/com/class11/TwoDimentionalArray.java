package com.class11;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		//Declare 2D Array
		int[][] array=new int[3][4];//3 rows and 5 columns
		//1st row
		array[0][0]=44;
		array[0][1]=80;
		array[0][2]=33;
	    array[0][3]=20;
	   //2nd row
	    array[1][0]=27;
	    array[1][1]=59;
	    array[1][2]=64;
	    array[1][3]=74;
	    //3rd row
	    array[2][0]=00;
	    array[2][1]=55;
	    array[2][2]=11;
	    array[2][3]=99;
	    System.out.println(array[1][2]);
	    
	    String[][] matrix=new String[2][3];
	  //1st row
	  		matrix[0][0]="a";
	  		matrix[0][1]="b";
	  		matrix[0][2]="c";
	  	   
	  	   //2nd row
	  	    matrix[1][0]="v";
	  	    matrix[1][1]="g";
	  	    matrix[1][2]="n";
	  	    System.out.println( matrix[1][2]);
	  	    int [][]numbers ={
	  	    	{1,2,3,4,5},
	  	    	{6,4,3,2,7},
	  	    	{9,8,7,6,5}	  	   
	  	    	
	  	    };
	  	    
	  	   System.out.println(numbers[1][1]);
	  	   
	  	   //To identify the numbers of Rows
	  	   System.out.println(numbers.length);
	  	   //To identify the numbers of Columns
	  	   System.out.println(numbers[1].length);
	  	   for(int i=0;i<numbers.length;i++) {
	  	   for(int j=0;j<numbers[0].length;j++) {
	  		   System.out.println(numbers);
	  		   
	  	   }
	}
	  	   
	}
	

}
