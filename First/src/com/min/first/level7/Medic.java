package com.min.first.level7;

public class Medic extends Unit{
 
	public Medic() {
		super("메딕",70);
	}
	
	public void heal(Unit unit) {
		boolean result = unit instanceof Carable;
		if(unit == this || result==false ) {
			
			System.out.println("치료못한다 하지마라");
			return;
		}
		unit.setCurrent_hp(unit.MAX_HP);	
	}
	
}
