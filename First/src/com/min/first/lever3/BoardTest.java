package com.min.first.lever3;

public class BoardTest {

	public static void main(String[] args) {
		
		BoardVO bv1 = new BoardVO("제목1", "내용1", 1);
		BoardVO bv2 = new BoardVO(); //기본생성자는 생성자가 하나도없을때만 생성해줌
		
		bv2.setTitle("제목2");
		bv2.setContent("내용2");
		bv2.setWriteId(25);
		
		
		System.out.println(bv1.getTitle());
		System.out.println(bv1.getContent());
		System.out.println(bv1.getWriteId());
		
		System.out.println(bv2.getTitle());
		System.out.println(bv2.getContent());
		System.out.println(bv2.getWriteId());
		
		
		
	}

}

