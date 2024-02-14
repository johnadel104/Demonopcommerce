Feature: user login
  Background:
    Given user is in website
    When user click on login button
    And enters his login password
    And clicks on login button
  Scenario: verify user can login with valid data
    And enters his email ID
    And clicks on login button
    Then user logged in his account
  Scenario: verify that user can't login with wrong data
  And enters invalid email
  And clicks on login button
  Then error message displayed
