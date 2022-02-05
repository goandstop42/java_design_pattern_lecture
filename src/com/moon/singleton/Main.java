package com.moon.singleton;

import java.util.Calendar;

/* Singleton
- 한번의 객체 생성으로 재 사용이 가능하기 때문에 메모리 낭비를 방지할 수 있다.
- 싱글톤으로 생성된 객체는 무조건 한번 생성으로 전역성을 띄기에 다른 객체와 공유가 용이하다.
- 단, 싱글톤으로 만든 객체의 역할이 간단한 것이 아닌 역할이 복잡한 경우라면 해당 싱글톤 객체를 사용하는 
다른 객체간의 결함도가 높아져서 객체 지향 설계 원칙에 어긋나게 된다
*/
public class Main {


	public static void main(String[] args) {
		Singleton singletong1 = Singleton.getInstance();
		Singleton singletong2 = Singleton.getInstance();
		
		if(singletong1 == singletong2) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
	}
}
