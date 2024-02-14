
Feature: Sliders
  Background: Given user is in site

  Scenario: verify user can click on Samsung slide
      When user clicks on Samsung slider
      Then user is directed to Samsung page

  Scenario: verify user can click on Iphone slide
        When user clicks on Iphone slide
        Then user is redirected to Iphone page