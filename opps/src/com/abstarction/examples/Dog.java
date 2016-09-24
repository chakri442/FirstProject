package com.abstarction.examples;

public class Dog extends Animal{
	@Override
	public void eatFood() {
		System.out.println("the dog is gonna eat puppy chew");
		
	}

	@Override
	public void sound() {
		System.out.println("the dog is gonna do sound like bo..bo...bo");
	}
	
	
	public void colour(){
		System.out.println("the colour of the dog is brown");
	}


	public static void main(String[] args) {
		
		Animal an = new Dog();
		an.colour();
		an.eatFood();
		an.sound();
		
		
	}

	
}
