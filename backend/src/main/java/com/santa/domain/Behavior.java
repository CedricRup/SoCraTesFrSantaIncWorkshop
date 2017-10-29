package com.santa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Behavior {

    private List<Deed> deeds = new ArrayList<>();

    public BehaviorEvaluatedEvent evaluate() {
        String evaluation;
        if (deeds.isEmpty()) {
            evaluation = BehaviorEvaluatedEvent.UNDEFINED;
        } else {
            Integer result = deeds.stream().collect(Collectors.summingInt(deed-> deed.getWeight()));
            if (result > 0) evaluation = BehaviorEvaluatedEvent.GOOD;
            else evaluation = BehaviorEvaluatedEvent.BAD;

        }
        return new BehaviorEvaluatedEvent(evaluation);
    }

    public BehaviorRecordedEvent record(Deed deed) {
        this.deeds.add(deed);
        return null;
    }
}
