package com.min.first.level2;

public class NormalVSRef {

	public static void main(String[] args) {
		
		int num = 10;
		System.out.println("before num : "+ num);
		changeVal(num);
		System.out.println("after num : "+ num);
		
		int[] numArr = {10};   //배열이 들어가면 레퍼런스 변수  배열에는 주소값이 들어간다.
		System.out.println("before numArr[0] : "+ numArr[0]);
		changeVal(numArr);
		System.out.println("after numArr[0] : "+ numArr[0]);
		
	}
	
	public static void changeVal(int[] numArr) {
		numArr[0] = 30;
	}
	
	public static void changeVal(int num) {
		num =30;
	}

}
