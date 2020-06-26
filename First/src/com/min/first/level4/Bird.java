package com.min.first.level4;

public class Bird extends Animal{
	
	/*public Bird() {
		super(" "," ");//부모의 기본생성자    2번 : 부모가 가지고 있는 생성자를 호출하기위해 형태를 바꿔준다.
		
	}*/
	
	Bird(String name){
		super(name, "조류");
	}
	
	
	
	void flying() {
		System.out.println("훨~~ 훨~~");
		
		
	}
	
	@Override
	void crying() {
		super.crying();
		System.out.println("쨱~~ 짹~~");
		
		
	}
}
