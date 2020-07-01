package com.min.first.level7;

public class Marine extends Unit implements AttackUnit, Carable{ //class일때 interface를 상속할떄는 implements 상속과 같은개념
	//implements뒤에 ,를붙이면 interface를 다중상속가능
	
	
	private int damage;
	
	public Marine() {
		super("마린", 50);
		damage = 5;
	}
	
	@Override
	public void attack(Unit u) {
		if( this == u) {
			System.out.println("자살방지");
			return;
		}
		System.out.println("다다다다따다~");
		u.getDamage(damage);
	}
}
