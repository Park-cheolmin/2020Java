package com.min.first.level2;

public class Array { //배열쓰는이유 : 변수선언을 덜하기위해서, for문과 이용하기 좋다

	public static void main(String[] args) {
		int[] arr = new int[100]; //배열은 reference변수    정수를 저장할수있는 100개짜리 방
		arr[0] = 10;
		arr[1] = 20; //값넣는 방법
		
		
		char[] arr2 = new char[20];         //int, float 등등 아무것도 안넣었을때 0      Boolean은 false가 들어있다
		float[] arr3 = new float[10];
		String[] arr4 =new String[200];  //레퍼런스 변수는 아무것도 안넣었을때는 NULL값이 들어있다
		
		
		int[] arr5 = {10, 20, 30, 40};
	
		System.out.println(arr[0]);
		//--------------------------------
		
		int[] arr7 = new int[100];
		
		for(int i = 0; i<arr7.length; i++) {     //한가지 일만 하게 만들어라   arr에 5를 100번넣는다   (넣는거따로)  
			arr7[i]=5;						     //레퍼런스 변수에만 x.length 같이 .을 쓸수있다.
		}
		
		for(int i = 0; i<100; i++) {     //한가지 일만 하게 만들어라   배열 100개를 만든다    (방만들기 따로)
			System.out.println(arr7[i]);
		}
	}

}
