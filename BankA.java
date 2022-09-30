package com.nissan.bean;

public class BankA extends Bank1{
	
	
	private int principleAmt;
	private double rate;
	private int time;
	

	public BankA() {
		super();
		// TODO Auto-generated constructor stub
	}



	public BankA(int principleAmt, int time) {
		super();
		this.principleAmt = principleAmt;
		this.time = time;
	}



	public double calSimpleInterest(){
		return this.principleAmt * this.time * 0.1;
	}
	
}
