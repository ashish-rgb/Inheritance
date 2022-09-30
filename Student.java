package com.nissan.bean;

public abstract class Student1 {
	 
	 //instance variables
	 private String name;
	 private int Id;
	 private double grade;
	 private int age;
	 private String address;
	 
	 //Default Constructor
	public Student1() {
		super();
	}

   
	//Parameterized Constructor
	public Student1(String name, int id, double grade, int age, String address) {
		super();
		this.name = name;
		Id = id;
		this.grade = grade;
		this.age = age;
		this.address = address;
	}

   //Getters and Setters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public double getGrade() {
		return grade;
	}


	public void setGrade(double grade) {
		this.grade = grade;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	 
	 //custom abstract methods
	public abstract boolean isPassed(double grade);
	
}
