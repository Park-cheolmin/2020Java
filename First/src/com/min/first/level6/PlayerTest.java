package com.min.first.level6;

public class PlayerTest {

	public static void main(String[] args) {
		Player player = new CDPlayer(); //추상 클래스사용해서 객체화 불가능
		player.play();
		
		player = new DVDPlayer();
		player.play();

	}

}

