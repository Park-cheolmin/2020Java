package com.min.first.level4;

public class ValueTest {

	public static void main(String[] args) {
		
		String str = new String("A");
		String str2 = new String("A");
		
		System.out.println("1: " + (str == str2));
		System.out.println("2: " + str.equals(str2));  //string은 equals를 오버라이딩했음
		
		Value val1 = new Value(1);
		Value val2 = new Value(1);
		System.out.println("3: " + (val1 == val2));  //value는 obj로 부터 상속받음
		System.out.println("4: " + val1.equals(val2));
	}

}
