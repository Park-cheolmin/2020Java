package com.min.first.level2;

public class Method4 {
	public static void main(String[] args) {
		
		sum(4,5);
		sum(5, 7, 9);
		sum(1, 2, 3, 4);
		sum(1, 2, 3, 4, 5);
		
		
	}
	/*public static void sum(int a, int ...arr) {
		//첫번째는 입력되고 2번째부터는 배열로 
	}*/
	
	
	public static void sum(int ...arr) {
		int sum =0;
		for(int i = 0; i<arr.length; i++) {
			sum  = arr[i]+sum;
			
		}
		System.out.println("sum : "+ sum);
	}
}
