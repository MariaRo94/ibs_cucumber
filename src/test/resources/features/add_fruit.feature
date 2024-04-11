Feature: Fruit adding

  Scenario: Add element to the list
    Given An element with type "vegetable" and name "batat" and id "1" and exotic "true"
    When The element are added
    Then The element list should be returned

  Scenario: Add element to the list
    Given An element with type "fruit" and name "apple" and id "2" and exotic "false"
    When The element are added
    Then The element list should be returned

  Scenario: Add element to the list
    Given An element with type "vegetable" and name "potato" and id "3" and exotic "false"
    When The element are added
    Then The element list should be returned

  Scenario: Add element to the list
    Given An element with type "fruit" and name "mango" and id "4" and exotic "true"
    When The element are added
    Then The element list should be returned