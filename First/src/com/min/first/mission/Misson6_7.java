package com.min.first.mission;

public class Misson6_7 {

public static void main(String[] args) {
		
		int star = 5;
		
		for(int i = 1; i<=star; i++) {
			
			for(int j=star; j>0; j-- ) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
			}
			
			System.out.println();
		}
		
		
	}

}
