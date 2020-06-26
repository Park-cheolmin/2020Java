package com.min.first.level4;  //기본생성자를 컴파일러가 자동으로 넣어줄때 : 생성자가 아무것도 없을때

public class Animal {

	private String name;
	private String type; //포유류, 조류, 어류
	
	//1번 : public Animal() {}   Animal에 기본생성자를 넣는다 
	
	protected Animal(String name, String type) {  //protected는 상속관계까지 접근가능
		this.name = name;
		this.type = type;
	}
	
	
	void crying() {
		
		System.out.println("울다~~");
	}
	
	void eat() {
		
		System.out.println("먹다~~");
	}
	
	void whoAmI() {
		System.out.printf("나는 %s 입니다.\n", name);
	}
}
