package com.min.first.baseball;

public class Baseball {
	private int[] rArr;  //배열이 있다고 선언
	
	Baseball(int num){
		init(num); //init메소드 호출
	}
	
	private void init(int num) {
		rArr = new int[num]; //n크기의 배열을 생성하겠다.
		setRandom();
	}
	
	private void setRandom() {
	
		for(int i = 0; i<rArr.length; i++) {
			rArr[i] = (int)(Math.random()*9+1);
			
			for(int z =0; z<i;z++) {
				if(rArr[i]==rArr[z]) {
					i--;
					break;
				}
			}
		}
	}
	
	public int get(int idx) {
		return rArr[idx];
	}
}

