@regression
Feature: Login Feature
  In Order to perform successful login
  As a User
  I have to enter correct username and password

  @smoke
  Scenario: User should navigate to login page successfully
    Given I open the application
    When I click on the login link
    Then verify that "Welcome, Please Sign In!" message display
@sanity
  Scenario: Verify the error message with invalid credentials
    Given I open the application
    When I click on the login link
    And I enter "invalidemail@example.com" in the email field
    And I enter "invalidpassword" in the password field
    And I click on the login button
    Then I should see the "Invalid email or password" error message

  Scenario: Verify that user should log in successfully with valid credentials
    Given I open the application
    When I click on the login link
    And I enter "validemail@example.com" in the email field
    And I enter "validpassword" in the password field
    And I click on the login button
    Then I should see the logout link

  Scenario: Verify that user should log out successfully
    Given I open the application
    And I click on the login link
    And I enter "validemail@example.com" in the email field
    And I enter "validpassword" in the password field
    And I click on the login button
    When I click on the logout link
    Then I should see the login link