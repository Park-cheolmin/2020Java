package com.min.first;

public class PrinF {
	public static void main(String [] args) {
		
		int age =28;
		String name = " 박철민 ";
		float vision = 1.0f;
		char bloodType  = 'A';
		
		System.out.println("나의 이름은" + name  + "입니다. 나의 나이는 " + age + "입니다." + " 나의 시력은 " + vision + " 입니다. " + "나의 혈액형은 " + bloodType + " 입니다. ");
		
		System.out.printf("나의 이름은 %s입니다. 나의 나이는 %d입니다. 나의시력은 %.1f입니다. 나의 혈액형은 %c입니다. \n", name, age, vision, bloodType); // %.1f 소수점 뒤 자리수  %,d는 천단위에 ,이 찍힌다.
		
		char v1 = '0';
		System.out.printf("%c : %d\n", v1, (int)v1);
		
		byte v2 = 66;
		System.out.printf("%c : %d\n", (char)v2, v2);
		
		
	}
}
