package com.min.first.mission;

import java.util.Scanner;

public class Mission4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" 월을 입력해주세요 : (1~12월)");
		String month = sc.next();
		
		switch(month) {
		
		case "3" : case "4": case "5": 
			System.out.println("봄 입니다.");
			break;
			
		case "6" : case "7": case "8": 
			System.out.println("여름 입니다.");
			break;
		
		case "9" : case "10": case "11": 
			System.out.println("가을 입니다.");
			break;
			
		case "1" : case "2": case "12":
			System.out.println("겨울 입니다.");
			break;
			
		default : 
			System.out.println(" 잘 못 입력 하셨습니다.");
			break;
		
		
		}
		sc.close();
		
	}

}
