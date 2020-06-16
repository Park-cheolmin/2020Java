package com.min.first;

public class Variable2 {
	public static void main(String[] args) {
		
		int num = 10;
		int num2, num3 = 20;
		int num4 = 10, num5 = 20;
		
		/*변수명 주의사항 p.25
		1. 소문자시작 (가능한 camel case기법 사용 ex) int myMaxHeieght 
		2. 특수기호는 _와 $만 사용가능 , 특수기호로 시작해도 무방
		3. 숫자 시작 x 뒤에붙이는건 가능
		4. 예약어(보라색) 사용 금지
		5. 변수명에 공백 x
		6. 변수명은 대소문자를 가린다. ex) aa, aA, Aa, AA 전부다름
		*/ 
		
		final int NUM = 1_000_000;  //final = 상수(상수명 한번 입력된 값이바뀌지않는다) , 상수명은 무조건 대문자, 구분은 언더바로 한다. 
		
		
	}
}
