package com.min.first.level2;

public class Method3 {

	public static void main(String[] args) {
		
		int result = sum(15,10);    //앞에 = 있으면 100% 비보이드형   , void형 일떈 =을 붙이면 안됨 ex) result = sum(15,10)[x]
 		
		result = minus(10,15);
		System.out.println(result);
		
		
	}
	
	public static int sum(int n1, int n2) {   //비 보이드형일 떄는 무조건 return해야함
		return n1 + n2;
		
		//return n1 + n2 + ""     더한후 문자열로 바뀐다.
		
		//return String.ValueOf(n1,n2);
	}
	
	public static int minus(int n1, int n2) {
		return n1 - n2;
	}

}
