package com.min.first.lever3;

import java.util.Arrays;

public class List { //리터럴을 4만 사용할 수 있음

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3};
		int[] arr2 = new int[4];
		
		for(int i =0; i<arr.length; i++) {
			arr2[i] = arr[i];
		}
		
		arr2[arr.length] =4;
		arr = arr2;
		
		

		System.out.println(Arrays.toString(arr));
		System.out.println();
	}

}
