package com.santa.steps;

import com.santa.domain.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class Steps {

    private final Behavior behavior = new Behavior();
    private BehaviorEvaluatedEvent resultEvent;

    @Given("^\"([^\"]*)\" has done more positive than negative deeds$")
    public void has_wise_point(String name) throws Throwable {
        behavior.record(new PositiveDeed(name));
        behavior.record(new PositiveDeed(name));
        behavior.record(new NegativeDeed(name));
    }

    @Given("^\"([^\"]*)\" has done more negative than positive deeds$")
    public void hasDoneANegativeDeed(String name) throws Throwable {
        behavior.record(new NegativeDeed(name));
        behavior.record(new NegativeDeed(name));
        behavior.record(new PositiveDeed(name));
    }

    @When("^an elf evaluates their behavior$")
    public void an_elf_evaluates_their_behavior() throws Throwable {
        resultEvent = behavior.evaluate();
    }

    @Then("^their behavior is considered \"([^\"]*)\"$")
    public void their_behavior_is_considered(String result) throws Throwable {
        assertEquals(result, resultEvent.getEvaluation());
    }


}
