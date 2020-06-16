package com.min.first.mission; //랜덤값

import java.util.Random;

public class Practice2 {

	public static void main(String[] args) {
		
		
		//0~9 랜덤값                         0~15까지일떈 16을 곱한다.
		double r = Math.random();
		
		int rVal = (int)(r * 10); 
		System.out.println(rVal);
		
		
		
		int rVal2 = (int)(Math.random() * 16);          // 위에 줄을 한줄로 줄이는 방법
		System.out.println(rVal2);
		
		
		//1~15
		int rVal3 = (int)(Math.random() * 15)+1;
		System.out.println(rVal3);
		
		
		//30~50
		int rVal4 = (int)(Math.random() * 21 + 30);
		System.out.println(rVal4);
		
		//46~77
		while(true) {
			
			int rVal5 = (int)(Math.random() * 32 + 46);
			System.out.print(rVal5+", ");
			if(rVal5>70) {
				break;
			}
		}
		
	}
}
