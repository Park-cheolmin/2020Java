package com.min.first.level4;

public class Value {

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
}
