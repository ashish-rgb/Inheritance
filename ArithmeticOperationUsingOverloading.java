package com.nissan.bean;

public class ArithmeticOperationUsingOverloading {

	/*
	  Write a java program to perform the arithmetic operations using the concept of method
overloading. Get two inputs Integer and the output must be a float. Get two inputs Float and
the output must be an Integer
	 */
	
	public static float intInput(int a , int b){
		float c  = a * b;
		return c;
	}
	
	public static int intInput(double a , double b){
		int c  = (int)a * (int)b ;
		return c;
	}
	
	public static void main(String args[]){
		System.out.println(intInput(3, 4));
		System.out.println(intInput(2.5, 2.5));
	}
	
}
