package com.moon.strategy;

/*
 * Strategy
알고리즘과 player 객체를 완전히 분리함
알고리즘 개선 시 알고리즘만 영향있음
*/
public class Main {

	public static void main(String[] args) {
		Player player1 = new Player("player1", new RockStrategy());
		Player player2 = new Player("player2", new PaperStrategy());
		Player player3 = new Player("player3", new RandomStrategy());
		Player player4 = new Player("player4", () -> Hand.Scissors);
		
		for (int i = 0; i < 3; i++) {
			System.out.println(player1.nextHand().fight(player3.nextHand()));
			System.out.println(Hand.getHand(i));
		}
	}
}
