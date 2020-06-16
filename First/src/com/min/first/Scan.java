package com.min.first;
import java.util.Scanner;  //컨스롤 + 쉬프트 + o


public class Scan {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	//new : 메모리에 올리겠다
		
		System.out.print("나이?");
		int age = scan.nextInt();
		System.out.println("나이 : " + age);
		
		
		System.out.print("이름?");
		String name = scan.next();
		System.out.println("이름 :"+ name);
		
		scan.close(); //scan쓰고 난 뒤에 닫을때 씀
		
	}
}
