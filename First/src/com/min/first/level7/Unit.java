package com.min.first.level7;

public class Unit {
	private final String NAME;
	private final int MAX_HP;
	private int current_hp;
	//final을 넣으면 무조건 메소드에 값을 넣어줘야한다. ex:
	/*public Unit(){
		super();
		NAME = "dd";
		MAX_HP= 2;*/
	
	public Unit(String name, int max_hp) {
		this.NAME = name;
		this.MAX_HP = max_hp;
		this.current_hp = max_hp;
	}
	
	public int getCurrent_hp() {
		return current_hp;
	}
	
	public void getDamage(int damage) {
				
		current_hp -= damage;
		
	}
	
	public void move(int x, int y) {
		System.out.printf("x:%d, y:%d 좌표로 이동\n", x, y);
	}
	
	@Override
	public String toString() {
		return String.format("%s, 현재 HP : %d", NAME, current_hp); 
	}

	
}
