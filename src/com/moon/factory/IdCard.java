package com.moon.factory;

public class IdCard implements Product {

	private String owner;
	
	public IdCard(String owner) {
		this.owner = owner;
	}


	public void use() {
		System.out.println(owner + " 님의 카드를 사용합니다.");
	}

	//객체내 factory class를 만들어서 사용할 수 있다.
	public static class Factory{
		public static IdCard create(String owner) {
			return new IdCard(owner);
		}
	}
}
