package com.min.first;

public class ConditionOperator {
	public static void main(String[] args) {
		
		int num = 3;
		
		//boolean isOdd =(num % 2 == 1 ? true : false ); //odd 홀수 
		
		String result = (num%2 == 1? "홀수 ": "짝수");
		
		System.out.printf("%d is %s %s\n", num, result);
		
	}
}
