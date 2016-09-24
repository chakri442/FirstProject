package com.encapsulation.examples;

public class Student {
	public String name;  //we can declare all data members as private and provide getter and setter methods to access them
	   
	public String getName(){  
	return name;  
	}  
	public void setName(String name){  
	this.name=name;  
	}  
 
		public static void main(String[] args){  
		Student s=new Student();  
	    s.setName("vijay"); 
	    System.out.println(s.getName());  
		}  
		}  

