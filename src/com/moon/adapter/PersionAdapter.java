package com.moon.adapter;

import com.company.adapter.Person;

public class PersionAdapter implements Student{

	private Person person;
	
	public PersionAdapter(Person person) {
		this.person = person;
	}
	@Override
	public String showName() {
		 return person.getName();
	}

	@Override
	public int showAge() {
		 return person.getAge();
	}

}
