package com.min.first.lever3;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		Car car1 = new Car("소나타", "흰색", 2500);
		Car car2 = new Car("그랜저");
		Car car3 = new Car("G80");
		
		
		car.introduceMyCar();
		car1.introduceMyCar();
		System.out.println("========================");
		car2.introduceMyCar();
		car3.introduceMyCar();

	}

}
