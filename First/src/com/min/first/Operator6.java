package com.min.first;

public class Operator6 {
	
	
	public static void main(String[] args) {
		
		String str1 = new String("안녕1");  
		String str2 = new String("안녕2"); //new는 새로운 객체가 태어났다
		
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));  //문자열 값 비교  값비교는 무조건 equals
		System.out.println("안녕1".equals(str1)); //변수를 뒤에쓰는것을 더 많이쓴다~!
		System.out.println("안녕4".equals("안녕5"));
		System.out.println("str2".equals("안녕6"));
	}
}
