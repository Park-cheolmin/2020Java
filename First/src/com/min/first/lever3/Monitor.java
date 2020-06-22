package com.min.first.lever3;

public class Monitor {

		static String brand;
		int inch;   //멤버필드에 static을 안붙인이유는 객체마다 값이다르게 하기위해서
		
		
		void printInfo() {
			System.out.printf("brand : %s, inch : %d\n", this.brand, this.inch);
		

		}
		
		void printInch() {                  //static안붙은 inch를 사용하려면 객체화를 해야함
			System.out.println(inch);
			System.out.println(brand);
		}
		
		
		static void printBrand() {  //static이 앞에 안붙은것은 무조건 객체화를 해야한다.
			System.out.println(brand);
		}

}

//멤버필드를 사용하지않을때는 무조건 static을 붙여라