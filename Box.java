package com.nissan.bean;

public class Box {

	//. Create a Box class with three instance variables as width, height, depth. Create a method
	//inside this class which returns the volume. Create two different objects in other class assign
	//values for instance variable and calculate the volume and print it.

	
	//instance variables
	public int width;
	public int height;
	public int depth;
	
	//constructor
	public Box(int width,int height,int depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	//methods
	public int volume(){
		return (width * height * depth);
	}
	
}
