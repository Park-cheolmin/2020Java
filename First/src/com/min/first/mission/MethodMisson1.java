package com.min.first.mission;

public class MethodMisson1 {

	public static void main(String[] args) {
		
		guguDan(2);
		guguDan(4,7); //4~7단까지
		

	}
	
	public static void guguDan(int a) {  //똑같은 Method 이름을 가진 여러개의 Method == 오버로딩
		
		int guguDan = 10;
		for(int i = 1; i<guguDan;i++) {
			
			System.out.printf("%d * %d = %d\n",a ,i ,a*i);
		}
		System.out.println();
	}
	
	public static void guguDan(int sDan, int eDan) {
		for(int i = sDan; i < eDan+1; i++) {
			guguDan(i);
		}
	}
	
	

	
}
