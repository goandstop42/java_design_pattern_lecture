package com.moon.strategy;

public class RockStrategy implements Strategy{

	@Override
	public Hand nextHand() {
		
		return Hand.Rock;
	}

}
