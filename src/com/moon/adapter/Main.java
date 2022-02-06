package com.moon.adapter;

import com.company.adapter.Person;

/* Adapter
- 다른 시스템에 있는 것이 본 시스템에서 사용하기 위해서 adapter 사용
- 기존 class를 wrapping하여 원하는 형태로 만듦
- 버그 발생 시 기존 class는 검증되었으니, 신규 adapter 만 확인하면 됨
*/
public class Main {

	public static void main(String[] args) {
		Person person = new Person("홍길동", 20);
		PersionAdapter adapter = new PersionAdapter(person);
		
		System.out.println(adapter.showAge());
	}

}
