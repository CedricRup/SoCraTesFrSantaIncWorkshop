Feature: Gift Selection

  Interesting things to say

  Scenario: A child has good behaviour if his wise points score is positive

    Given "Cédric" has done more positive than negative deeds
    When an elf evaluates their behavior
    Then their behavior is considered "Good"


  Scenario: A child has bad behaviour if his wise points score is negative

    Given "Cédric" has done more negative than positive deeds
    When an elf evaluates their behavior
    Then their behavior is considered "Bad"