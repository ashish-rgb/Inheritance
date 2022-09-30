package com.nissan.app;

import java.util.Scanner;

import com.nissan.bean.Bank1;
import com.nissan.bean.BankA;
import com.nissan.bean.BankB;
import com.nissan.bean.BankC;

public class DemoBankOverridingApp {

	public static void main(String args[]){
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Principle Amount : ");
		int principleAmt = input.nextInt();
		
		System.out.print("Enter time : ");
		int time = input.nextInt();
		
		Bank1 bankA = new BankA(principleAmt,time);
		Bank1 bankB = new BankB(principleAmt,time);
		Bank1 bankC = new BankC(principleAmt,time);
		
		System.out.println("For Bank A SI is : " + bankA.calSimpleInterest());
		System.out.println("For Bank B SI is : " + bankB.calSimpleInterest());
		System.out.println("For Bank C SI is : " + bankC.calSimpleInterest());
		
	}
	
}
