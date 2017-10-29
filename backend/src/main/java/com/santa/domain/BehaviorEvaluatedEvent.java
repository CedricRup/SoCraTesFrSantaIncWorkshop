package com.santa.domain;

public class BehaviorEvaluatedEvent {

    public static final String UNDEFINED = "UNDEFINED";
    public static final String GOOD = "Good";
    public static final String BAD ="Bad";
    private String evaluation;

    public BehaviorEvaluatedEvent(String evaluation) {
        this.evaluation = evaluation;
    }

    public String getEvaluation() {
        return evaluation;
    }
}
