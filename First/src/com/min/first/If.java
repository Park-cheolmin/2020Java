package com.min.first;

public class If {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		if(n1 > n2) {                                                      //if() 괄호안에 들어가는건 boolean 타입뿐이다
			System.out.println("n1이 n2보다 크다");
			
		} else if(n1 == n2) {
			System.out.println("n1이 n2와 같다");
		}
		  else {
			System.out.println("n1이 n2보다 크지않다");
		}

		System.out.println("종료");
	}

}
