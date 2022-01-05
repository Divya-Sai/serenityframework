Feature: Login into nopCommerce Admin Application
  Scenario: Login with valid credentials  successfully
    Given Launch Chrome Browser
    When User enter username and password
    Then Click on Login Button
    And Verify the title of the page