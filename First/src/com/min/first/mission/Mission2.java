package com.min.first.mission;

import java.util.Scanner;

public class Mission2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print(" 정수를 입력하세요 : ");
		int input = scan.nextInt();
		
		scan.close();
		if((input % 2) == 0) {
			System.out.println("짝수입니다");
			
		} else {
			System.out.println("홀수입니다");
		}
		
		
	}

}
