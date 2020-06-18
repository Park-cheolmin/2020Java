package com.min.first.mission;

public class GreatMission3 {
	public static void main(String[] args) {
		int[][] arr = {
				{90, 100, 88}, //영어
				{34, 99, 45}, //수학
				{98, 65, 87} //국어
		};

		String[] clsArr = {"영어", "수학", "국어"}; //과목명 출력용
		int[] sumArr = new int[clsArr.length]; //과목별 합계 점수 저장용

		for(int i=0; i<arr.length; i++) {
			for(int z=0; z<arr[i].length; z++) {
				sumArr[i] += arr[i][z];
			}
		}

		int totalSum = 0; //전체합계
		int totalCnt = 0; //전체평균 계산하기 위한 카운트
		for(int i=0; i<sumArr.length; i++) {
			System.out.printf("%s합계: %d, 평균: %.1f\n", clsArr[i], sumArr[i], (float)sumArr[i]/arr[i].length);
			totalSum += sumArr[i];
			totalCnt += arr[i].length;   //arr[0] = 3(90,100,88) 
		}

		System.out.printf("전체합계: %d, 평균: %.1f\n", totalSum, (float)totalSum/totalCnt);

		
	}
}



/*
public class GreatMission3 {

 	영어합계 :? 평균 :?
 	수학합계 :? 평균 :?
 	국어합계 :? 평균 :?
 	전체합계 :? 평균 :?
 
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
*/