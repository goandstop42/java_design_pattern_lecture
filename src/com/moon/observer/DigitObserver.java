package com.moon.observer;

public class DigitObserver implements Observer{

	@Override
	public void update(int number) {
		// TODO Auto-generated method stub
		System.out.println("숫자 : " + number);
	}

}
