package com.dev;

import java.util.Scanner;

public class NumberString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number:");
		String number= in.next();
		
		// to convert to integer,float and double data type
		int intval=Integer.parseInt(number);
		float floatval=Float.parseFloat(number);
		double doubleval= Double.parseDouble(number);
		
		//Printing primitive data types
		System.out.println("Integer value is:" +intval);
		System.out.println("Float value is:" +floatval);
		System.out.println("Double value is:" +doubleval);
		
		// into objects
		int intobject=Integer.valueOf(number);
		float floatobject=Float.valueOf(number);
		double doubleobject=Double.valueOf(number);
		
		// Printing objects
		System.out.println("Integer object is:" +intobject);
		System.out.println("Float object is:" +floatobject);
		System.out.println("Double object is:" +doubleobject);
		
		in.close();
		
		
		
		
	}

}
