package com.min.first;

public class Variable {
	public static void main(String[] args) {
		
		//일반변수
		char v1;  //문자형 변수 (변수선언은 한번만)
		v1 = 'A';  // '' = 값  "" = 객체    리터럴값 : A,B,127와 같은 고유값(리터럴값도 타입이있다)
		System.out.println(v1);
		
		v1 = 'B';
		System.out.println(v1);
		
		byte v2;  //정수값저장 1바이트
		short v3; //정수값저장 2바이트
		int v4;   //정수값저장 4바이트
		long v5;  //정수값저장 16바이트
		
		/*v2 = (byte)128;  byte는 -128~127까지 128을 넣었을시 오버플로우 발생*/
	    v2 = 10;
		v3 = 20;
		v4 = 30;
		v5 = 50;
		//변수끼리 만났을때 type이 값아야한다.
		
		System.out.println();
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		
		float v6;  //실수형 4바이트
 		double v7;  //실수형 8바이트 (용량이클수록 정확도에 가까워짐)
 		
 		v6 = 10.1f; //10.1은 실수다 float에서 쓰려면 강제로 형변환 : (float)10.1; ==10.1f; == 10.1F
 		v7 = 10.1;
 		
 		v6 = (float)v7; //v6와 v7의 형태는 다르므로 double인 v7을 v6인 float와 같게 만든다.
 		System.out.println(v6);
 		
		boolean v8; //참 거짓
		
			
		
		
		//reference변수
		String r1 = "안녕하세요~";  // "안녕하세요~" 자체가 주소값 
		Variable r2;
		
		//일반변수와 reference변수의 가장 큰 차이점 : 변수명 . 쳤을때 referre
	}
}
