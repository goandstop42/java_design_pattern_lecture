package com.moon.strategy;

public class PaperStrategy implements Strategy{

	@Override
	public Hand nextHand() {
		
		return Hand.Paper;
	}

}
