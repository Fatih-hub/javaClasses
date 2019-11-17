package com.class6;

public class Recap {

	public static void main(String[] args) {
		int time=10;
		String timeOfDay="random value";
		if(time>=1 &&  time<=11) {
			timeOfDay="Morning";
			
		}else if(time>=12&& time <=15) {
			timeOfDay="Afternoon";
			
		}else if(time>=16&& time<=20) {
			timeOfDay="Evening";
			
		}else if(time>=20) {
			timeOfDay="Night";
			
		}else {
			System.out.println("Unknown");
		}
		System.out.println(timeOfDay);


	}

}
