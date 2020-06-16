package com.min.first.mission;

public class Misson6_4 {

	public static void main(String[] args) {
		
		for(int i = 1; i<10; i++ ) {               //옆으로 변하는 값이 안쪽 for문           줄로변하는것이 밖의 for문
			
			for(int j = 2; j<10; j++) {
				System.out.printf("%d * %d = %d\t ", j, i, i*j);
				
			}
			System.out.println();
			
		}

	}

}
