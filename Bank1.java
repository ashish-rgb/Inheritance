package com.nissan.bean;

public class Bank1 {
	
	/*
	  Write a java program to perform the arithmetic operations using the concept of method
overloading. Get two inputs Integer and the output must be a float. Get two inputs Float and
the output must be an Integer.Write a java program to perform the concept of method
overriding for calculating simple interest of 3 banks A,B,C. using dynamic method dispatch
Bank A’s rate of interest-10%, Bank’s B rate of interest-9%, Bank’C rate of interest -7%
	 */	
	
	private int principleAmt;
	private double rate;
	private int time;
	
	

	public Bank1() {
		super();
		// TODO Auto-generated constructor stub
	}

   

	public Bank1(int principleAmt, double rate, int time) {
		super();
		this.principleAmt = principleAmt;
		this.rate = rate;
		this.time = time;
	}



	public double calSimpleInterest(){
		return this.principleAmt * this.time * 0.2;
	}
	
}
