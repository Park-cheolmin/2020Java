package com.min.first.level3;

import java.util.ArrayList;
import java.util.Arrays;

public class MyListTest {   //class 앞에 public을 붙이려면 파일명이랑 같은 이름이여야한다.

	public static void main(String[] args) {
		
		MyList list = new MyList();
		list.add(10); //void일 확률 높음 앞에 =이없음
		list.add(15);
		list.add(18);
		list.add(20);
		/*
		int len = list.size();
		System.out.println(len);
		
		int val = list.get(1);//15
		System.out.println(val);
		
		
		list.sremove(2);
		list.Sadd(1,100); 
		list.remove();*/
		
		//int delVal = list.remove();    //마지막 값 지우고, 지우는 값 리턴
		int delVal = list.remove(2);     //2번 인덱스방에 있는 값을 지우고, 해당 값 리턴
		
		MyArrays.print(list); //[10,15,20]이 출력되도록
		String str = MyArrays.toString(list); //[10,15,20] 문자열을 리턴 Arrays.toString사용 금지
		System.out.println(str);
		
	}

}
class MyArrays{
	static void print(MyList list) {
		/*
		int[] temp = new int[list.size()];
		for(int i =0; i<list.size();i++) {
			temp[i] = list.get(i); 
		}
		System.out.println(Arrays.toString(temp));
		*/
		 System.out.println(Arrays.toString(list.getArr()));    //Arrays.toString = 배열을 바로 출력하지못해서 문자열로 출력하기위해 사용
	}
	 static String toString(MyList arr) {
			String str = "";
			for(int i =0; i<arr.size(); i++) {
				if(i==arr.size()-1) {
					str += arr.get(i);
					continue;
				}
				str += arr.get(i)+", "; 
			}
			
			// return "[" + str + "]";
			return String.format("[%s]", str);
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
	
	int[] getArr() {
		return arr;
	}
	
	/*int remove() {
		int delVal = arr[arr.length-1];
		int[] temp = new int[arr.length-1];
		for(int i = 0; i < temp.length; i++) {
			temp[i]=arr[i];
		}
		arr = temp;                                                          
		System.out.println(Arrays.toString(arr));
	
		return delVal;
		
	}
	*/
	int remove(int num) {
		int delVal = arr[num];
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
		
		return delVal;
	}
	
	int remove() {
		return remove(arr.length-1);
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
	
	void Sadd(int num1, int num2) {
		
		int[] temp = new int[arr.length+1];
		
		
		for(int i = 0; i<temp.length; i++) {
						
			if(i<num1) {
				temp[i]=arr[i];
			}else if(i>num1) {
				temp[i]=arr[i-1];
			}
			
			//temp[i] = (i<num1)?arr[i]:arr[i-1];	
			
			
		}
		temp[num1] = num2;
		
		arr=temp;
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	
	
}



