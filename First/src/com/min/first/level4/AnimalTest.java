package com.min.first.level4;

public class AnimalTest {

	public static void main(String[] args) {
		//Animal animal = new Animal();
		Bird bird = new Bird("참새");
		Bird bird2 = new Bird("기러기");
		//Bird bird3 = new Bird(); //  Bird의 기본생성자를 못만들게 하기위한 방법은??
		//animal.crying();
		
		bird.crying();
		bird.flying();
		
		Sparrow sparrow = new Sparrow();
		sparrow.whoAmI(); //sparrow 클래스에 없으면 바로위의 bird껄 출력

	}

}
