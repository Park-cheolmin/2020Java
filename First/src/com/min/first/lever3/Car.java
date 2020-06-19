package com.min.first.lever3;

public class Car {
	String name;
	String color;
	int cc;
	
	public Car() {//생성자의 기본 모양			// 1.이름이 클래스명이랑 똑같다 
											//2. return타입이없다
		this("소나타","흰색",2500);
		
		
	}
	
	public Car(String name, String color, int cc) {
		super();//생략 가능       //바로 직속부모
		this.name = name;   //this는 나의 객체 주소값
		this.color = color;
		this.cc = cc;
	}
	//super() 소괄호는 생성자 호출
	//this. 붙이게 되면 주소값.name  주소값. 은 무조건 지역변수나, 메소드 호출이다.
	//this사용할떄는 public Car(String name, String color, int cc)과 this.name처름 name이 같을때 구별하기 위해쓴다
	
	
	public void introduceMyCar() {
		
		
		System.out.printf("%s의 컬러는 %s이고 %dcc이다.\n", name, color, cc);
	}
}


