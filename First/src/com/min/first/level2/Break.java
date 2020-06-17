package com.min.first.level2;

public class Break {

	public static void main(String[] args) {
		
		
		for(int z=0; z<100; z++) {    //break는 반복문을 멈추고싶을떄 사용
			for(int i =0; i<3; i++) {
			
				if(z==3){break;}
				for(int e=0; e<3; e++) {
					
					System.out.printf("%d -%d\n", z, i);
				}
				
				
				}
			
			
		}
	}

}
