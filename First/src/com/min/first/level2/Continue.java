package com.min.first.level2;

public class Continue {

	public static void main(String[] args) {
		
		for(int i= 0; i<20; i++) {
			
			if(i==5 ) {continue;}
			System.out.println(i);   //continue는 출력칸은 스킵하고 바로 i++쪽으로 보내고 싶을떄 사용   for문을 종료시키지않는다. (밑에 내용을 skip한다)
		}
	
		
		
	}	
}


