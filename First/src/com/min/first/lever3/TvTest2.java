package com.min.first.lever3;

public class TvTest2 {

	public static void main(String[] args) {
		
		Tv tv1 = new Tv();   // new의 갯수가 곧 객체의 갯수다!!! 객체생성의 이유는 각각 다른값을 넣기위해서
		Tv tv2 = new Tv();
		
		tv1.channelUp();
		tv1.channelUp();
		
		System.out.println("tv1 channel : "+ tv1.channel);
		System.out.println("tv2 channel : "+ tv2.channel);
	}

}
