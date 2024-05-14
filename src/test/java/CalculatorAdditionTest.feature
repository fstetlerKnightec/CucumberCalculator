Feature: I test to sum values on the calculator

  Scenario: Add five and three
    When I open the calculator
    And I press five
    And I press plus
    And I press three
    And I press equals
    Then the output should display 8
