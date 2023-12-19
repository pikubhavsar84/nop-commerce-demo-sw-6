@regression
Feature: Register Test
  As a user I want to register into nop commerce website

@sanity
  Scenario: Verify User Should Navigate To Register Page Successfully
    Given I am on homepage
    When I click on register link
    Then I should see the register text
@smoke
  Scenario: Verify That First Name, Last Name, Email Password and Confirm Password Fields are Mandatory
    Given I am on homepage
    When I click on register link
    And I click on register button
    Then I should see the error message "First name is required." in first name field
    And I should see the error message "Last name is required." in last name field
    And I should see the error message "Email is required." in email field
    And I should see the error message "Password is required." in password field
    And I should see the error message "Password is required." in confirm password field

  Scenario: Verify That User Should Create Account Successfully
    Given I am on homepage
    When I click on register link
    And I click on female radio button
    And I enter "Sam" in first name field
    And I enter "Patel" in last name field
    And I select "5" day
    And I select "May" month
    And I select "1990" year
    And I enter email "ram12@ymail.com"
    And I enter password "123456"
    And I enter confirm password "123456"
    And I click on register button
    Then I should see the registered message "Your registration completed"