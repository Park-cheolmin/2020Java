package com.min.first.level2;

public class ArrayOrder3 { //버블정렬

	public static void main(String[] args) {
		
		int[] arr = {29, 33, 15, 88, 2, 46 , 92, 1, 19};
		/*
		 for(int i -arr.length -1; i>0; i--){
		 	for(int z = 0; z<i;. z++{
		 	
		 	}
		 }
		 */
		
		for(int i = 1; i < arr.length; i++) {
	        for(int j = 0 ; j < arr.length -i ; j++) {
	        	
	            if(arr[j] > arr[j+1]) {
	                int temp = arr[j+1];
	                arr[j+1] = arr[j];
	                arr[j] = temp;
	            }
	        }
	    }

		for(int val : arr) {
			System.out.print(val + ", ");
		}
		
			
	}

}
/*



*/