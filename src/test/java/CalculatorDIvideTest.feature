Feature: Take two values and divide them
  
  Scenario: Divide ten by two
    When I open the calculator
    And I press one
    And I press zero
    And I press divide
    And I press two
    And I press equals
    Then the output should display 5