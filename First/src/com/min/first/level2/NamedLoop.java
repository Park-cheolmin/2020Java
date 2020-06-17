package com.min.first.level2;

public class NamedLoop {

	public static void main(String[] args) {
		
		Parent: 
		for(int i = 0; i<10; i++) {
			for(int z = 0; z<20; z++) {
				
				if(z==15) {
					break Parent;   //Parent:로 이동해서 for문을 깨버린다.
					
				}
				System.out.printf("%d - %d\n",i , z);
			}
		}

	}

}
