package com.interfacexamples;

public class InterfaceTest implements AtmInterface{
	
	
public void withdraw() { 
		
		System.out.println("enter the money is  to be withdrawed");
		
		
	}

	public void deposit() {
		System.out.println("enter the money is  to be deposited");
		
		
	}

	public void checkBal() {
		System.out.println("your acc bal is 2000");
		
		
	}

	public static void main(String[] args) {
		
		
		InterfaceTest interobj = new InterfaceTest();
		
		interobj.checkBal();
		interobj.withdraw();
		interobj.deposit();
		

	}

	

	

}
