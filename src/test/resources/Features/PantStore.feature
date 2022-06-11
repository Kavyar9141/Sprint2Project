Feature: Test Store functionality

  Scenario: To check Pantstore to be open sucessfull
    Given initialize browser with chrome
    And navigate to "http://uniformm1.upskills.in/" site
    And click on profile icon
    Then verify register and login button appears
    And click on pant
    Then user should navigate to the pant page
    And close browser