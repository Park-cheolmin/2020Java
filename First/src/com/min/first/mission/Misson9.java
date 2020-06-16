package com.min.first.mission;

public class Misson9 {

	/*
	  arr 1부터 100값이 들어가도록 순서대로
	  0번방에 1              2
	  1번방에 2              4
	  2번방에 3~99번방에 100
	  -------------------
	   각방에있는 모든 값을 더한 후 결과값 출력
	  
	 */
	public static void main(String[] args) {
		
		int[] arr1 = new int[10];
		int sum = 0;
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = (i+1)*2;
		}
		
		
		for(int i = 0; i < arr1.length; i++) {
			sum = arr1[i] + sum;
			
		}
		System.out.printf("합계 : %,d",sum);
		System.out.println();
		
		for(int i =0; i<arr1.length; i++) {
			
			System.out.print(arr1[i]);
			
			if(i != arr1.length-1) {
				System.out.print(", ");
				
			
			}
			
		}
		System.out.println();
		
		for(int i =0; i<arr1.length; i++) {
			
			if(i!=0) {
				System.out.print(", ");
			}
			System.out.print(arr1[i]);
		}
		
		
	}

}
