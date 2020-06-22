package com.min.first.lever3;

public class MonitorTest2 {

	public static void main(String[] args) {
		Monitor.brand = "삼성"; //static붙였을때 호출방법     객체마다 다른 값이 들어가길 원하면 static을 붙으면안됨
		Monitor.printBrand();
		
		Monitor m1 = new Monitor(); //static 없을때 객체화 하는방법
		m1.printInfo();
		
		int result = Integer.parseInt("11");
		System.out.println(result);
		
	}

}


