package com.min.first.mission;

import java.util.Scanner;

public class Misson7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		while(true) {
			System.out.print("숫자를 입력하세요 :   (종료:0)");
			int input = sc.nextInt();
				
			if(input == 0) {	
				break;
			} else if((input%2) == 0) {			//짝수만 더하기
				sum = sum + input;
			}
			
			System.out.println("합계 : " + sum);
		}
		
	}

}

