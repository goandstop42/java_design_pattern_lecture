package com.moon.observer;

public class Main {
	
	public static void main(String[] args) {
		
		RandomGenerator randomGenerator = new RandomGenerator();
		
		Observer observer1 = new DigitObserver();
		Observer observer2 = new GraphicObserver();
		
		// Observer ����
		Observer observer3 = number -> {
			for (int i = 0; i < number; i++) {
				System.out.print("=");
			}
			System.out.println();
		};
		randomGenerator.addObservers(observer1);
		randomGenerator.addObservers(observer2);
		randomGenerator.addObservers(observer3);
		
		randomGenerator.execute();
//		randomGenerator.execute();
	}
}
