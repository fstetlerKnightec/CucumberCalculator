Feature: Add numbers

  Scenario: Add 5 and 3
    When I take 5
    And I add 3
    Then I verify the number to be 8