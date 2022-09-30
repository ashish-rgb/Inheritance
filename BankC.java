package com.nissan.bean;

public class BankC extends Bank1{
	
	private int principleAmt;
	private double rate;
	private int time;
	
	
	
	public BankC() {
		super();
		// TODO Auto-generated constructor stub
	}



	public BankC(int principleAmt, int time) {
		super();
		this.principleAmt = principleAmt;
		this.time = time;
	}
	
	public double calSimpleInterest(){
		return principleAmt * time * 0.07;
	}

}
