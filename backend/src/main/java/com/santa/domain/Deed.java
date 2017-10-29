package com.santa.domain;

public class Deed {
    protected String childName;

    public int getWeight() {
        return weight;
    }

    protected int weight;

    public Deed(String childName, int weight) {
        this.childName = childName;
        this.weight = weight;
    }
}
