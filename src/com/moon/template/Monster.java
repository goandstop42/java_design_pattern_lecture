package com.moon.template;

public class Monster {

	private char prefix;
	private int hp;
	
	public char getPrefix() {
		return prefix;
	}

	public void setPrefix(char prefix) {
		this.prefix = prefix;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public Monster(char prefix) {
		this.prefix = prefix;
		this.hp = 50;
	}
	
	public void attack() {
		System.out.println();
	}
	
}
