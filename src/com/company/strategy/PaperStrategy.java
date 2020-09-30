package com.company.strategy;

public class PaperStrategy implements Strategy {
    @Override
    public Hand nextHand() {
        return Hand.Paper;
    }
}
