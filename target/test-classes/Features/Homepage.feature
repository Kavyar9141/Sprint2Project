Feature: feature to test homepage functionality

  Scenario Outline: Check url navigates to the homepage
    Given initialize browser with chrome
    And navigate to "http://uniformm1.upskills.in/" site
    And click on profile icon
    Then verify register and login button appears
    And close browser
    