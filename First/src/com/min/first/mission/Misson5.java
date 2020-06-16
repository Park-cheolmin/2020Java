package com.min.first.mission;

import java.util.Scanner;

/*
점수를 입력해 주세요: (0~100)
90점 이상 A
80점 이상 B
70점 이상 C
나머지는 D입니다.

or

100초과면 잘 못 입력하였습니다.

일의 자리 수가 7점 이상이면 +
일의 자리 수가 3점 이하이면 -

예를 들어 95 > A, 97 > A+, 83 > B-
*/
public class Misson5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해주세요 :    (0~100)");
		int score = sc.nextInt();
		sc.close();
		
		
			if(score > 100 || score < 0) {
				System.out.print("잘못 입력했습니다.");
				return;
				
			}else if(score < 70) {
				System.out.print("D");
				
			}else if(score < 80) {
				System.out.print("C");
			}
			 else if(score < 90) {
				System.out.print("B");
			}else {
				System.out.print("A");
			}
			
			
			if( score == 100  ) {
				System.out.println("+");
			} else {
				int mod = (score % 10);
				
				if(mod>=7) {
					System.out.println("+");
				}else if(mod<=3) {
					System.out.println("-");
				}
				
			}
	}

}
