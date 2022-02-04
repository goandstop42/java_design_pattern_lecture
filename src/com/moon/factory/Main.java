package com.moon.factory;

/* factory 패턴 장점
- 객체 생성 매서드는 노출되어 있다.
- 다른 클래스 변경에 영향을 주지 않는다.
- Main class에서 IdCard class import 하지 않는데 그 class의 기능을 사용할 수 있다.
- 그래서 결합도가 떨어진다. 
*/
public class Main {


	public static void main(String[] args) {
		
		//IdCardFactory factory = new IdCardFactory(); // 이것도 상관없음
		Factory factory = new IdCardFactory();
		Product idCard1 = factory.createProduct("james");
		Product idCard2 = factory.createProduct("kim");
		
		idCard1.use();
		idCard2.use();
		
		// 객체내 factory class 만들 경우
		// 이 경우에는 결합도가 생김, 개발 편의성 우선
		IdCard idCard3 = IdCard.Factory.create("netty");
		idCard3.use();
	}
}
