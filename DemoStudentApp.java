package com.nissan.app;

import java.util.Scanner;

import com.nissan.bean.Grad;
import com.nissan.bean.Undergrad;

public class DemoStudentApp {

	public static void main(String[] args) {
		
		//user input
		Scanner input =new Scanner(System.in);
		Scanner scan =new Scanner(System.in);
		
		//create objects
		Grad grad=new Grad();
		Undergrad ugrad=new Undergrad();
		
		//For Graduate
		System.out.println("For Graduate");
		
		System.out.println("Enter Id : ");
		grad.setId(input.nextInt());
		System.out.println("Enter name : ");
		grad.setName(scan.nextLine());
		System.out.println("Enter Age : ");
		grad.setAge(input.nextInt());
		System.out.println("Enter Address : ");
		grad.setAddress(scan.nextLine());
		
		System.out.println("Enter Grade :-");
		
		//Condition
		if((grad.isPassed(input.nextDouble()))==true)
		System.out.println("Passed in Grad");
		else
		System.out.println("Fail in Grad");
		
		//For UnderGraduate
		System.out.println("For Undergraduate");
		
		System.out.println("Enter Id : ");
		ugrad.setId(input.nextInt());
		System.out.println("Enter name : ");
		ugrad.setName(scan.nextLine());
		System.out.println("Enter Age : ");
		ugrad.setAge(input.nextInt());
		System.out.println("Enter Address : ");
		ugrad.setAddress(scan.nextLine());
		
		System.out.println("Enter Grade :-");
		
		//Condition
		if((ugrad.isPassed(input.nextDouble()))==true)
		System.out.println("Passed in UnderGrad");
		else
		System.out.println("Fail in UnderGrad");

	}

}
