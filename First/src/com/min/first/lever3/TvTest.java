package com.min.first.lever3;

public class TvTest {

	public static void main(String[] args) {
		
		Tv tv1 = new Tv();  //Tv를 객체화 해서  주소값을 왼쪽에 준다.  , Tv(): 기본생성자  , Tv tv1에는 Tv객체 주소값만 저장가능
		
		System.out.println("name :" +tv1.name);
		System.out.println("power :" +tv1.power);
		System.out.println("channel :" + tv1.channel);
		
		System.out.println("-----------------");
		tv1.name = "삼성Tv";  //Tv1이 가지고 있는 변수중 name에 삼성tv변수를 넣는다
		System.out.println("name : " + tv1.name);
		tv1.changePower();
		System.out.println("power : " + tv1.power);
		tv1.changePower();
		System.out.println("power : " + tv1.power);
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		System.out.println("channel : " + tv1.channel);
		
	}

}
