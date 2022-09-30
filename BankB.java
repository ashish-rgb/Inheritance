package com.nissan.bean;

public class BankB extends Bank1{

	private int principleAmt;
	private double rate;
	private int time;
	
	
	
	public BankB() {
		super();
		// TODO Auto-generated constructor stub
	}



	public BankB(int principleAmt, int time) {
		super();
		this.principleAmt = principleAmt;
		this.time = time;
	}



	public double calSimpleInterest(){
		return principleAmt * time * 0.09;
	}
	
}
