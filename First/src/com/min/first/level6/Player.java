package com.min.first.level6;

public abstract class Player {//추상 : 내용은없고 선언만 하는것. 
							  //특징 : 객체화가 안되고 , 부모역할만 한다(나를 상속하거라)
							  
	public abstract void play();
	
	public void stop() {
		System.out.println("재생을 멈췄다.");
	}
}
	
class CDPlayer extends Player{

	@Override
	public void play() {
		System.out.println("CD를 재생합니다");
		
	}
}

class DVDPlayer extends Player{

	@Override
	public void play() {
		System.out.println("DVD를 재생합니다.");
		
	}
	
	
}

