package com.nissan.bean;

public class Undergrad extends Student{

	public boolean isPassed(double grade) {
		if(grade>70){
		return true;
		}
		else
		return false;
		}
	
}
