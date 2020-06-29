package com.min.first.level5;

public class AnimalMisson {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		Sparrow spa = new Sparrow();
		
		doCry(dog);
		doCry(cat);
		doCry(spa);
		
		
		
	}
	
	public static void doCry(Animal ani) {
		ani.cry();
		
	}

}
