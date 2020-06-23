package com.min.first.lever3;

import java.util.ArrayList;
import java.util.Arrays;

public class MyListTest {   //class 앞에 public을 붙이려면 파일명이랑 같은 이름이여야한다.

	public static void main(String[] args) {
		
		MyList list = new MyList();
		list.add(10); //void일 확률 높음 앞에 =이없음
		list.add(15);
		list.add(18);
		list.add(20);
		
		int len = list.size();
		System.out.println(len);
		
		int val = list.get(1);//15
		System.out.println(val);
		
		list.remove();
		list.Sremove(2);
	
		
		
	}

}


class MyList{
	
	private int [] arr;
	
	MyList(){
		
		 init();
	}
	
	private void init() {
		arr = new int[0];
	}
	
	int size() {
		
		return arr.length;
	}

	int get(int num){
		
		return arr[num];
		
	}
	
	void remove() {
		
		int[] temp = new int[arr.length-1];
		for(int i = 0; i < temp.length; i++) {
			temp[i]=arr[i];
		}
		arr = temp;
		System.out.println(Arrays.toString(arr));
		
	}
	
	void Sremove(int num) {
		
		int[] temp = new int[arr.length-1];
		
		for(int i = 0; i<temp.length; i++) {
			if(i<num) {
				temp[i] = arr[i];
			}else {
				temp[i] = arr[i+1];
			}
		//temp[i] = (i<num)?arr[i]:arr[i-1];   삼항식	
		}
		arr = temp;
		System.out.println(Arrays.toString(arr));
		
		
		
	}
	
	void add(int num) {
		
		int[] temp = new int[arr.length+1];
		
		for(int i = 0; i<arr.length; i++) {
			
			temp[i] = arr[i];
		}
		
		temp[arr.length] = num;
		arr = temp;
		
		
		System.out.println(Arrays.toString(arr));
		
		
	
	
	}
	
	
	
	
	
	
	
	
	
}