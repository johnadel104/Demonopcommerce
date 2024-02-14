
Feature: follow us feature
  Background:
    Given user opens demo commerce
    Scenario: user clicks on facebook
      When user clicks on facebook button
      And the tab is switched
      Then user is in facebook page
Scenario: user clicks on twitter button
  When user clicks on twitter button
  And the tab is switched to twitter
  Then user is in twitter page
  Scenario: user clicks on rss button
    When user clicks on rss button
    And the tab is switched to rss
    Then user is in rss page
    Scenario: user clicks on youtube button
      When user clicks on youtube button
      And the tab is switched to youtube
      Then user is in youtube page
