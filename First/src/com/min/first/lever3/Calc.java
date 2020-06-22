package com.min.first.lever3;

public class Calc {

	int n1; //2번문제   (멤버필드)
	int n2; //2번문제	 (멤버필드) 
	
	public int sum() { //2번문제
		
		int result = 0;//지역변수
		return n1 + n2;
	}
	
	public static int sum(int a, int b) { //1번문제
			
		return a+b;
	}
	
}


//전역변수 : 멤버필드  
//지역변수 : 
//메소드는 모두 멤버메소드
//static이 붙은 것들은 별개로 생각해라

//**static이 붙으면 무조건 class명. 으로 접근해라**
//this. == 주소값 . 
