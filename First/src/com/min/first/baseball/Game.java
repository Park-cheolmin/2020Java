package com.min.first.baseball;

public class Game {

	public static void main(String[] args) {
		int gameCnt = 3;
		Baseball ball = new Baseball(gameCnt);
		MyBall myBall = new MyBall(gameCnt);
		
		
		//int val = ball.get(0);  0번재 인덱스 값
		
		do {
			myBall.setNumbers(); //숫자1: 입력받고, 숫자2: 숫자3:
		}while(Checker.check(gameCnt, ball, myBall));
		
		
		System.out.println("게 임 종 료 ");
	}

}
