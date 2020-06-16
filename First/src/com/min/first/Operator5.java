package com.min.first;

public class Operator5 {
	public static void main (String[] args) {
		
		int n1 = 10;
		int n2 = 11;
		boolean result = (n1 == n2);  //같은지 판별
		
		System.out.println(n1 == n2);
		
		result = (n1 != n2);          //다른지 판별
		System.out.println(result);
		
		result = n1 > n2;             //크기 비교
		System.out.println(result);
		
		result = n1 >= n2;
		System.out.println("n1 > n2 : " + result);
		
		result = n1 <= n2;
		System.out.println("n1 > n2 : " + result);
		
		//결과 값의 반대로 하고싶을때 !를 쓴다.
		//******문자열은 == 비교 하면안된다******
	}
}
