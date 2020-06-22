package com.min.first.lever3;

public class BoardVO {
	private String title;
	private String content;
	private int writeId;
	
	public BoardVO() {
	}
	
	public BoardVO(String title, String content, int writeId) {
		super();
		this.title = title;
		this.content = content;
		this.writeId = writeId;
	}
	
	//seter는 무조건 void
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public void setWriteId(int writeId) {
		this.writeId = writeId;
	}
	
	public int getWriteId() {
		return this.writeId;
	}
	
	
}
//패키지가 다를때 public을 사용해서 가능하다.


//private : 같은 클래서 안에서
//default : 같은 패키지
//protected : default + 상속관계