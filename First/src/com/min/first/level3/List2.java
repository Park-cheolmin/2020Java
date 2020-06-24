package com.min.first.level3;

import java.util.ArrayList;

public class List2 {

	public static void main(String[] args) {
		

		
		
		ArrayList<Integer> list = new ArrayList(); //int형 배열을 만든다 <Integer>
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(10);
		
		list.add(2,11);//2번째 자리에 11을 넣고 나머진 뒤로밀린다
		list.remove(list.size()-1); //마지막 list삭제
		
		
		int value = list.get(2);  //list 2번째 자리를 프린트
		System.out.println(value);
		
		//int[] arr = {1, 2, 3}와 같다. 배열생성
		
		for(int i = 0; i<list.size(); i++) {
			int val = list.get(i);  
			System.out.print(val + ", ");
		}
		System.out.println();
		
		for(int val : list) {       //object == 최상위 부모
			System.out.print(val + ", ");
		}

	}

}
