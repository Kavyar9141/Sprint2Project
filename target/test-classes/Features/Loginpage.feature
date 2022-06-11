Feature: Test Loginpage functionality

  Scenario: To check Loginpage to be open sucessfull
    Given initialize browser with chrome
    And navigate to "http://uniformm1.upskills.in/" site
    And click on profile icon
    Then verify register and login button appears
    And click on login
    Then user should navigate to the login page
    And close browser
