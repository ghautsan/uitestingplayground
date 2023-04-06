Feature: User be able to login
  As user
  I want to see Sample App page
  So that I can see my welcome message

  Scenario: As user, I have be able to success login
    Given I am on the Sample App page
    When I input any username
    And I input valid password
    And I click login button
    Then I see the welcome sign