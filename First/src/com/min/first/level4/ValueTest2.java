package com.min.first.level4;

public class ValueTest2 {

	public static void main(String[] args) {
		String str = new String("안녕");
		System.out.println(str); //str은 자동으로 오버라이딩 되있기떄문에 값이뜸
		
		System.out.println();
		
		Value val = new Value(2);
		System.out.println("val :" + val);
		
		
		
		String strVal = String.valueOf(val);
		String strVal2 = val.toString(); //obj에 toString메소드를 썼다
		

	}

}
