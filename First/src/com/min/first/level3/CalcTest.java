package com.min.first.level3;

public class CalcTest {

	public static void main(String[] args) {
		
		//Calc.sum(10,20)  ***이렇게 혼자있을때는 void일 확률이 높다***
		
		System.out.println(Calc.sum(10,20));  //1번문제
		
		Calc calc1 = new Calc();       //2번문제    *객체화 했을때는 static (x)
		calc1.n1 = 20;
		calc1.n2 = 30;
		
		System.out.println(calc1.sum());
	}

}

