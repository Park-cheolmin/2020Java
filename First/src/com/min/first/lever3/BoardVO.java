package com.min.first.lever3;

public class BoardVO {
	private String title;    //값넣는방법 : 생성자를통해서 넣는다, setter(메소드)로 넣는다
	private String content;  //값빼는 방법 : getter
	private int writeId;
	//유일하게 public인 멤버필드 == 상수
	
	public BoardVO() {
	}
	
	public BoardVO(String title, String content, int writeId) {
		super();
		this.title = title;      //this를 쓴이유 : 전역변수 지역변수가 이름이 같아서
		this.content = content;
		this.writeId = writeId;
	}
	
	//seter는 무조건 void
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setWriteId(int writeId) {
		this.writeId = writeId;
	}
	
	public int getWriteId() {
		return writeId;
	}
	
	
}
//패키지가 다를때 public을 사용해서 가능하다.


//private : 같은 클래서 안에서
//default : 같은 패키지
//protected : default + 상속관계