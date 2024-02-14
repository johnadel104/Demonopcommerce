Feature: user registration
  Scenario: verify that user can register using valid data
  Given user is in home page
    When user click on register button
    And clicks on gender
    And enters his first name
    And enters his last name
    And selects day of birthdate
    And selects month of birthdate
    And selects year of birthdate
    And enters his email
    And enters his password
    And confirms password
    And clicks on register button
    Then success message displayed
