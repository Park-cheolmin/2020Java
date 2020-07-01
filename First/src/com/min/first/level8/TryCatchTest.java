package com.min.first.level8;

public class TryCatchTest {

	public static void main(String[] args) {
		meth();
		/*
		try {
			meth2();  //throws 사용시 메소드 호출을 try/catch문으로 해야해줘야한다.
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		int a = div(10,2);
		System.out.println(a);
	}


	public static int div(int n1, int n2) {
		try{
			return n1/n2;
		}catch(Exception e) {
			return 0;
		}
	}
	
	public static void meth2() throws ClassNotFoundException{ //예외발생시 미루는 역할
		Class.forName("ddsd");
	}
	
	public static void meth() {
		int result = 2;
		try {//예외가 발생될것같은 것을 감싼다
			//result = 10/0;
			
			Class.forName("");
			
		} catch(ClassNotFoundException e) {
			
		} catch(Exception e) {//예외가 터져야 실행
			System.out.println("예외가 발생했습니다.");
		} finally {//해도되고 안해도되고   예외가 터지든 아니든 무조건 실행되는 부분    (어떤경우라도 실행한다. )
			System.out.println("finally");
		}

		System.out.println("result : " + result);
		System.out.println("종료!");
	}

}
