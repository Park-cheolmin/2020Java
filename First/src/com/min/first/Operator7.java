package com.min.first;

public class Operator7 {
	public static void main(String[] args) {
		
		int n1 = 5;
		int n2 = 5;
		int n3 = 6;
		
		System.out.println(n1 == n2 && n1 == n3 && n2 == n3);  //and는 false가 하나라도 있으면 false
		System.out.println(n1 == n2 || n1 == n3 || n2 == n3);  //or는 하나라도 true이면 true 
		
	}
}
