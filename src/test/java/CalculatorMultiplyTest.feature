Feature: I test to multiply values on the calculator

  Scenario: Multiply eight and two
    When I open the calculator
    And I press eight
    And I press multiply
    And I press two
    And I press equals
    Then the output should display 16
