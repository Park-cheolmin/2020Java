package com.min.first.mission;

import java.util.Scanner;

public class Misson8 {

	public static void main(String[] args) {
		/*랜덤값 10~90을 맞추는 게임
		 * 
		     값입력 : 20
		   UP
		     값입력 : 40
		   UP
		     값입력 : 80
		   DOWN
		     값입력 : 75
		   GREAT!!
		 */	
		/*
		 int min = 10;
		 int max = 90;
		 int rVal = (int)(Math.randon() * (max - min +1) 
		 */
		Scanner sc = new Scanner(System.in);
		int rVal = (int)(Math.random() * 81 + 10);
		
		int min = 10;
		int max = 90;
		
		while(true) {
			System.out.println("값 입력 : ");
			int input = sc.nextInt();
			
			
			if(input>max || input<min) {
				System.out.println("잘 못 입력하셨습니다.");	
			} else if(input>rVal) {
				System.out.println("Down");
			}else if(input<rVal) {
				System.out.println("UP");
			}else {
				break;
			}
					
		}
		System.out.println("GREAT");
	}
}
