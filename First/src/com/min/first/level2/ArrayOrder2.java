package com.min.first.level2;

public class ArrayOrder2 {  //선택정렬

	public static void main(String[] args) {
		
		int[] arr = {29, 33, 15, 88, 2, 46 , 92, 1, 19};
		int min = 0;
		int temp =0;
		
		for(int i=0; i<arr.length-1;i++) {
			min = i;
			for(int j=i+1; j<arr.length;j++) {
				if(arr[min]>arr[j]) {
					min = j;
				}
				
				
			}
			if(i!=min) {
				temp = arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
			}
			
			
		}
		
		for(int val : arr) {
			System.out.print(val + ", ");
		}
	}

}
