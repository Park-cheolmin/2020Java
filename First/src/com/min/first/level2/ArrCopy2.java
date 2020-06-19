package com.min.first.level2;

import java.util.Arrays;

public class ArrCopy2 {

	public static void main(String[] args) {
		
		int[] arr = {2, 4, 6, 7, 10, 55};
		
		int[] arr2 = copyArr(arr);
		int[] arr3 = copyArr(arr);
		System.out.println(arr == arr2);
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arr2 : " + Arrays.toString(arr2));
		

	}

	
	public static int[] copyArr(int[] arr) {
		
		int[] arr2 = new int[arr.length];  //arr2 의 배열 생성                   //new : 객체를 생성한다
		
		for(int i = 0; i<arr.length; i++) {   //arr2에 arr의 값을 복사  (주소값은 다르다)
			arr2[i] = arr[i];
		}
		
		return arr2;
		
	}
}
