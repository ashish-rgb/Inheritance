package com.nissan.app;

import java.util.Scanner;

import com.nissan.bean.Box;

public class DemoBoxVolume {

	public static void main(String[] args) {
		
		////declare variables
		Scanner sc = new Scanner(System.in);
		
		//user input
		System.out.print("Enter width :");
		int width = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter height :");
		int height = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter depth :");
		int depth = Integer.parseInt(sc.nextLine());
		
		//creating objects
		Box box1 = new Box(width,height,depth);
		
		//display result
		System.out.print("Volume is :" + box1.volume());
		
	}

}
