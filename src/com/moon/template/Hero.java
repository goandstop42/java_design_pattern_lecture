package com.moon.template;

public class Hero {
	private String name;
	private int hp;
	
	public Hero(String name) {
		this.name= name;
		hp = 100;
	}
	
	public void attack(Monster monster) {
		System.out.println("몬스터 "  + monster.getPrefix()+ "공격했다");
	}
}
