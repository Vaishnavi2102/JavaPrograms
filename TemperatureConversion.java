package com.dev;

import java.util.Scanner;

public class TemperatureConversion {
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the temperature in celcius:");
		float tempincelcius=input.nextFloat();
		
		//celcius->Fahrenheit
		
		float cfar=(tempincelcius*9/5)+32;
		System.out.println("Temperature in fahreheit is: "+cfar);
		
		//celcius->Kelvin
		
		float ckel=tempincelcius+ 273.15f;
		System.out.println("Temperature in kelvin is: "+ckel);
		
		// Input for Fahrenheit
		System.out.println("Enter the temperature in fahreheit:");
		float tempinfar=input.nextFloat();
		
		// Fahrenheit->celcius
		
		double fcel=(tempinfar-32)*5/9;
		System.out.println("Temperature in celcius is: "+fcel);
		
		// Fahrenheit->Kelvin
		
		double fkel=fcel+273.15f;
		System.out.println("Temperature in Kelvin is: "+fkel);
		
		//Input for kelvin
		
		System.out.println("Enter the temperature in Kelvin:");
		float tempinkelvin=input.nextFloat();
		
		
		//Kelvin->celcius
		
		float kcel=tempinkelvin-273.15f;
		System.out.println("Temperature in celcius is: "+kcel);
		
		//Kelvin->fahrenheit
		
		float kfar= ((tempinkelvin-273.15f)*9/5)+32;
		System.out.println("Temperature in fahreheit is: "+kfar);
		
		input.close();
		

	}

}
