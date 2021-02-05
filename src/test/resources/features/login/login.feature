Feature: Make login in a website
  As a user
  I want to make login in the website

  Scenario: Successful login
    Given Tomas has an active account
    When he make login with email and password
    Then the login is successful