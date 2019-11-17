package com.class3;

public class TemperatureCheck {
	public static void main(String[]args) {
		double tempC=33;
		if(tempC<32) {
			System.out.println("Water will freeze with temperature "+tempC);
		}else {
			System.out.println("Water will not freeze with temperature "+tempC);
		}
	}

}
