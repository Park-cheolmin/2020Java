package com.min.first.mission;

public class Practice3 {

	public static void main(String[] args) {
		
		int len = 9;
		int[] arr = new int[len];
		//1~9 사이의 랜덤한 값을 중복되지 않게 arr 배열 크기만큼 초기화한다.
		
		
		for(int i =0; i<arr.length; i++) {
			
			arr[i]=(int)(Math.random()*9+1);
					
					for(int j = 0; j<i; j++) {
						if(arr[i]==arr[j]) {
							i--;
							break;
							
						}
						
					}
			
		}
		
		for(int val : arr) {
			System.out.println(val);
		}
		
	}

}
