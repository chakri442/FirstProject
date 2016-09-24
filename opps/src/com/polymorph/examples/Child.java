package com.polymorph.examples;

public class Child extends Parent{
	
	public void walk(){
		
		System.out.println("child walk");
	}

	public static void main(String[] args) {
	
          Parent obj = new Child();//dynamic binding
          Parent ob1 = new Parent();
          Child obj2 = new Child();//static binding
          
          obj.walk();
          //obj1.walk();
          obj2.walk();
	}

}
