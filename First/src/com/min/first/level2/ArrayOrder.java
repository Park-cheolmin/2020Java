package com.min.first.level2;

public class ArrayOrder { //순차정렬

	public static void main(String[] args) {
	
		int[] arr = {29, 33, 15, 88, 2, 46 , 92, 1, 19};   //오름차순으로 정렬
		int temp=0;
	
		for(int i=0; i<arr.length-1; i++) {
			for(int j =i+1; j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;		
				}
			}
				
			
		}
		for(int val : arr) {
			System.out.print(val + ", ");
		}

	

	}

}


