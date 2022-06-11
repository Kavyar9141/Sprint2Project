Feature: Test Registerpage functionality

  Scenario: To check Registerpage to be open sucessfull
    Given initialize browser with chrome
    And navigate to "http://uniformm1.upskills.in/" site
    And click on profile icon
    Then verify register and login button appears
    And click on register
    Then user should navigate to the registeration page
    And close browser
