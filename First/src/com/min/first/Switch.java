package com.min.first;

public class Switch {//문자열 비교시 Switch문이 좋다.

	public static void main(String[] args) {
	
		String num = "사";
		
		switch(num) {
		
			case "이": 
				System.out.println("1 이다");
				break;
				
			case "삼":
				System.out.println("2 이다");
				break;
		
			case "사":
				System.out.println("3 이다");
				break;
		
			default: //필수 아님 else와 같은역할
				System.out.println("1~3 이 아니다");
				break;
			
		
		}
	}

}
