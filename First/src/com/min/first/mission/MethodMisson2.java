package com.min.first.mission;

public class MethodMisson2 {

	public static void main(String[] args) {
	 
		printstar(6);
		System.out.println("---------------");
		printstar(3);
		System.out.println("---------------");
		printStarSqure(4);
		System.out.println("---------------");
		printStarTriangle(5);
		System.out.println("---------------");
		printStarTriangleReverse(5);
		System.out.println("---------------");
		printStarReverse(5);
	}
	
	
	public static void printstar(int a) {
		
		for(int i=0; i<a; i++) {
			System.out.print("*");
			
		}
		System.out.println();
	}
	
	public static void printStarSqure(int a) {
		
		for(int i =0; i<a; i++) {
			printstar(a);
		}
		
	}
	public static void printStarTriangle(int a) {
		
		for(int i = 1; i<=a; i++) {
			printstar(i);
		}
		
	}
	
	public static void printStarTriangleReverse(int a) {
		
		for( int i = 1; i<=a; i++) {
			for(int z =a-i; z>0 ; z--) {
				System.out.print(" ");
			}
			printstar(i);
		}
			
	}
	public static void printStarReverse(int a) {
		
		for(int i=a; i>0;i--) {
			printstar(i);
		}
			System.out.println();
			
		
			
	}
	
	
	

}
