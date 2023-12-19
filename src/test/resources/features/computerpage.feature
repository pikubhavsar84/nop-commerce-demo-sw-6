@regression
Feature: Computer Test
  As a user I want to build computer and add to cart into nop commerce website
@sanity
  Scenario: Verify User Should Navigate To Computer Page Successfully
    Given I am on homepage
    When I click on computer link
    Then I should see the "Computers" text message computer page
@smoke
  Scenario: Verify User Should Navigate To Desktops Page Successfully
    Given I am on homepage
    When I click on computer link
    And I click on desktop link
    Then I should see the "Desktops" text message desktop page

@smoke
  Scenario Outline: Verify That User Should Build You Own Computer And Add Them To Cart Successfully
    Given I am on homepage
    When I click on computer link
    And I click on desktop link
    And I click on build computer link
    And I select "<processor>" processor
    And I select "<hdd>" hdd button
    And I select "<ram>" ram
    And I select "<os>" os
    And I select "<software>" software
    And I click on add to cart button
    Then I should see the "The product has been added to your shopping cart" success message

    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |