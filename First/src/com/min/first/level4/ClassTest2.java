package com.min.first.level4;

public class ClassTest2 {

	public static void main(String[] args) {
		
		ClassA clsA = new ClassB();
		clsA.print();
		
		ClassB clsB = (ClassB)clsA;   //자식 B가 부모A를 가르킨다
		clsB.showMe(); //classA는 showme메소드가 없다.

	}

}

/*다형성 
 *1.(상속관계)부모타입은 자식 객체 주소값을 저장할수 있다(가리킬수있다)
 *2. 자식타입은 부모 객체 주소값을 저장할 수 없다.(가리킬수없다)
 *3. 타입은 메소드 호출 할 수 있나 없나만 결정한다.(자기가 알고 있는 메소드만 호출 할 수 있다)
 	  호출 했을 떄는 객체 기준으로 실행이 된다
 */

