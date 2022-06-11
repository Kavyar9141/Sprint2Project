Feature: Test ShirtStore functionality

  Scenario: To check Shirtstore to be open sucessfull
    Given initialize browser with chrome
    And navigate to "http://uniformm1.upskills.in/" site
    And click on profile icon
    Then verify register and login button appears
    And click on shirts
    Then user should navigate to the shirt page
    And close browser