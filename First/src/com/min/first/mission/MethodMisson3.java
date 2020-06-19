package com.min.first.mission;

public class MethodMisson3 {

	public static void main(String[] args) {
		
		int result = abs(10);
		System.out.println(result);
		
		result = abs(-10);
		System.out.println(result);
		

	}
	
	public static int abs(int n1) {
		if(n1<0) {
			return -n1;
		}
		return n1;
		
		//한줄로  return (num<0) ? -num : num;
	}

}
