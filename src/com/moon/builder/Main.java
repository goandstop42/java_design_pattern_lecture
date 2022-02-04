package com.moon.builder;

/* builder 패턴 장점
- 코드 읽기 / 유지보수 편하다.
- 객체 생성을 깔끔하게 할 수 있다.
- 기존 방식으로 하면 생성자를 통해서 만들어야 하는데,
 여러 매개변수 조합을 만들 때마다 생성자를 만들어야 한다. 
*/
public class Main {

	public static void main(String[] args) {

		Text text =	new Text.Builder()
			.setTitle("Hello")
			.setContent("hello content")
			.setItems("항목1", "항목2", "항목3")
			.build();
		
		System.out.println(text);
	}

}
