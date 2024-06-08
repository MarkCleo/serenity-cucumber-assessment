Feature: Login Credentials

  @login
  Scenario:
    Given I am in the Login Page
    When I enter valid credentials
    And I click the submit button
    Then I should be able to login

