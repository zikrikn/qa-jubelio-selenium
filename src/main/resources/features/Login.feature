Feature: User Login

  Scenario: Login successfully
    Given user opens the login page
    When user enters valid email and password
    And user clicks the login button
    Then user is redirected to the dashboard
