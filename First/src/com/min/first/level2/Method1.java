package com.min.first.level2;

public class Method1 {
	public static void main(String[]args) {  //메소드 쓸떄 public static은 무조건 써라.     void위치 : return타입(메소드의 결과물), (string[]args)위치 : 파라미터[외부에서 값을 받아오는 통로]==매개변수
                  //void main(string[]args)부분 : 메소드 선언부  		
					
				  //----void는 일을시켰을때 회신이없다.----
		          //void가 아닐때는 회신이 데이터로 넘어온다 값은 무조건 1개.
				  //Method안에  MEthod는 없다
	
		sum(10,15); //변수명 옆에 소괄호는 메소드랑 연관되어있다.(값만 써라 정의는 메소드 안에서)
		minus(20,5);
		
			  	
	}
	
	public static void sum(int n1, int n2) {
		
		System.out.println( n1 + n2 );
		return;//원래는 return을 무조건 써야하지만 void는 자동으로 써진다. ㅡ void가 아닌경우는 무조건 return을 써야한다.
		
		  
		
	}//메소드 정의	
	//메소드를 쓰면 같은소스를 안써도되고 호출로쓴다.	
	//메소드안에서 메소드 호출은 가능!!!, 정의는 할수없다
	
	public static void minus(int n1, int n2) {
		System.out.println(n1 - n2);
	}
	
	
	
	
	
	
}
