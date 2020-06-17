package com.min.first.mission;

public class GreatMission3 {
/*
 	영어합계 :? 평균 :?
 	수학합계 :? 평균 :?
 	국어합계 :? 평균 :?
 	전체합계 :? 평균 :?
 */
	public static void main(String[] args) {
		int sum = 0;
		double avg = 0;
		
		int[][] arr= {
				{90, 100, 88}, //영어
				{34, 99, 45},  //수학
				{98, 65, 87} 
		};//국어
				
				for(int i =0; i<arr.length; i++) {
					sum = 0;
					avg = 0;
					for(int j =0; j<arr[i].length; j++) {
						
						sum = arr[i][j]+ sum;
						avg = (sum / arr.length);
						
					}
					
					if(i==0) {
						System.out.printf("국어합계 : %d, 평균 : %.1f\n",sum,avg);
					}else if(i==1) {
						System.out.printf("영어합계 : %d, 평균 : %.1f\n",sum,avg);
					}else {
						System.out.printf("수학합계 : %d, 평균 : %.1f\n",sum,avg);
					}
					
				
				}
				
				
				
				
		
	}

}
