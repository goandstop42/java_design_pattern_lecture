package com.moon.singleton;

public class Singleton {

	private static final Singleton sInstance = new Singleton();
	//static 메서드로로 선언하면 객체 생성없이도 사용 가능 
	public static Singleton getInstance() {
		return sInstance;
	}
}
