package com.min.first.mission;

import java.util.Scanner;

public class GreatMisson1 {

	
	public static void main(String[] args) {
		/*
		  숫자 야구게임 만들기
		  
		 */
		System.out.println("--------------숫자 야구게임----------------");
		Scanner sc = new Scanner(System.in);
		
	
		final int LEN = 3;
		
		int min = 1;
		int max = 9;
		int cnt = 0;
		int strike =0;
		int ball = 0;

		
		int[] com = new int[LEN];
		int[] user = new int[LEN];
		
		for(int i=0; i<LEN; i++) {
			com[i] = (int)(Math.random()*9+1);
			
			for(int j =0; j<i; j++) {
				if(com[i]==com[j]) {
					i--;
					break;
					
				}
			}
			
			
		}
		
		while(true) {
			cnt++;
			strike=ball=0;
			
			for(int i= 0; i<LEN; i++) {
				System.out.printf("%d 번째 숫자 입력 : \n",i+1);
				user[i] = sc.nextInt();
				
				if(user[i]<min || user[i]>max) {
					System.out.println("1~9사이 숫자를 입력해주세요");
					break;
				}
				
				
			}
			//스트라이크 볼체크
			for(int i = 0; i<LEN; i++) {
				for(int j = 0; j<LEN; j++) {
					
					if(com[i]==user[j]) {
						
						if(i==j) {
							strike++;
						}else {
							ball++;
						}
					}
					
				}
			}
			
			if(strike == LEN) {
				break;
			}
			System.out.printf("Strike : %d, Ball : %d, OUT: %d\n", strike, ball, (LEN-strike-ball));
				
		}
		
		System.out.printf("%d번 만에 성공하셨습니다. -종료-",cnt);
		
		
		
		
	}
	

}


