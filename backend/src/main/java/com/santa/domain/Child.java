package com.santa.domain;

public class Child {
    private String name;
    private int wisePointsScore;

    public Child(String name) {
        this.name = name;
    }

    public void updateWisePointsScore(int wisePointsScore) {
        this.wisePointsScore = wisePointsScore;
    }
}
