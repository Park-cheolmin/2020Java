package com.min.first.mission;

import java.util.Scanner;

public class GreatMission2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------------메뉴------------");
		
		final int menu = 7;
		int total = 0;
		
		String[] drink = {"사이다", "콜라", "환타", "마운틴듀", "초코우유", "바나나우유", "딸기우유"};
		int[] price = {500, 600, 700, 800, 400, 400, 300};
		
		
		for(int i = 0; i<menu; i++) {
			System.out.printf("%d. %s(%d원)\n",i+1,drink[i],price[i]);
		}
			
	
		while(true) {
			
			System.out.println("메뉴를 선택하세요 : (종료:0)");
			int num = sc.nextInt();
			
			if(num<0 || num>7) {
				System.out.println("잘 못 입력하셨습니다.");
			}else if(num == 0) {
				break;
			}else {
				total = total + price[num-1];
				System.out.printf("%s %d원\n",drink[num-1],price[num-1]);
			}
		}
		
		System.out.printf("종료 : %,d원",total);
			
			
		}
	

	
}
