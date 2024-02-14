
Feature: wishlist feature
  Background:
    Given User open Demo commerce home page
    When clicks on HTC product
    And clicks on HTC wishlist button
    Scenario: user adds HTC product to wishlist
      Then notification bar displayed in green
Then success message displayed on top
      Scenario: verify that quantity value bigger than zero
        And Wait until the notification disappear
        And clicks on wishlist tap
        Then quantity value is more than zero

