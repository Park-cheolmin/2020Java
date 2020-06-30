package com.min.first.level4;

public class Value { //class에 final을 붙으면 상속불가능, 변수앞에 붙이면 상수만, 메소드앞에붙이면 오버라이딩 금지

	private int val;
	
	public Value(int val) {
		this.val = val;
	}

	public int getVal() {
		return val;
	}
	
	@Override
	public boolean equals(Object obj) {
		Value val2 = (Value)obj;   //obj에는 getVal가 없으므로 Value로 형변환
		
		/*boolean result = (val == val2.val) ? true: false;
		return result;*/
		if( val == val2.getVal() ) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return String.valueOf(val); 
		//return String.format("%d,val); format과  valueOf가 같이만 format은 printf과 사용방법이 같다  
		//valueOf와 format은 int를 String으로 변환
	}
}
