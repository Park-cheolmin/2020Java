package com.min.first.baseball;

public class Game {

	public static void main(String[] args) {
		int gameCnt = 3;
		Baseball ball = new Baseball(gameCnt);
		MyBall myBall = new MyBall(gameCnt);
		
		myBall.setNumbers(); //숫자1: 입력받고, 숫자2: 숫자3:
		int val = ball.get(0); // 0번재 인덱스 값
		
		
		
		
		
	}

}
