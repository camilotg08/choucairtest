Feature: Create new category
  As a user
  I want to create a new category and validate it

  Scenario: successful category creation
    Given Tomas must be logged in and in the Blog module
    When he create a new category
    Then the category must be displayed