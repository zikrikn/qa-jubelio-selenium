Feature: Inventory Adjustment

  Scenario: Adjust inventory successfully
    Given user logs into the system
    When user navigates to the inventory page
    And user selects an inventory item
    And user clicks the adjustment button
    And user inputs "50" for the first value
    And user inputs "20" for the second value
    And user saves the adjustment
    Then the inventory adjustment is saved successfully
