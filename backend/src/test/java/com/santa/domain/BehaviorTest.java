package com.santa.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class BehaviorTest {

    @Test
    public void noDeedEvaluateToUndefined() throws Exception {
        assertEquals(BehaviorEvaluatedEvent.UNDEFINED, new Behavior().evaluate().getEvaluation());
    }

    @Test
    public void onePositiveDeedEvaluatesToGood(){
        Behavior behavior = new Behavior();
        behavior.record(new PositiveDeed("anyName"));
        assertEquals(BehaviorEvaluatedEvent.GOOD, behavior.evaluate().getEvaluation());
    }

    @Test
    public void oneNegativeDeedEvaluatesToBad(){
        Behavior behavior = new Behavior();
        behavior.record(new NegativeDeed("anyName"));
        assertEquals(BehaviorEvaluatedEvent.BAD, behavior.evaluate().getEvaluation());
    }

}