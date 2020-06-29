package com.min.first.level5;

public class AnimalTest {

	public static void main(String[] args) {
		Animal ani = new Dog();
		ani.cry();
		ani = new Cat();
		ani.cry();  //animal 타입은 아무리 cat을 가리키고있어도 ani.sleep메소드를 호출할수없다 본인이 sleep을 가지고있지않기때문에
		
		Cat cat = (Cat)ani;
		cat.cry();
		cat.sleep(); //cat type은 가능함 sleep 메소드 호출.
		//사용하려는 메소드중에 가장 부모를 가리켜라.
		
		
	}

}
