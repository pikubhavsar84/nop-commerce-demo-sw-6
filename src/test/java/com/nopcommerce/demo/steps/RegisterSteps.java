package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {
    @When("I click on register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();

    }

    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }

    @Then("I should see the register text")
    public void iShouldSeeTheRegisterText() {
        new RegisterPage().getRegisterText();
    }

    @And("I click on register button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("I should see the error message {string} in first name field")
    public void iShouldSeeTheErrorMessageInFirstNameField(String errorMessage) {
        new RegisterPage().getValidationErrorMessageForField(errorMessage);
    }

    @And("I should see the error message {string} in last name field")
    public void iShouldSeeTheErrorMessageInLastNameField(String errorMessage) {
        new RegisterPage().getValidationErrorMessageForField(errorMessage);
    }

    @And("I should see the error message {string} in email field")
    public void iShouldSeeTheErrorMessageInEmailField(String errorMessage) {
        new RegisterPage().getValidationErrorMessageForField(errorMessage);
    }

    @And("I should see the error message {string} in password field")
    public void iShouldSeeTheErrorMessageInPasswordField(String errorMessage) {
        new RegisterPage().getValidationErrorMessageForField(errorMessage);
    }

    @And("I should see the error message {string} in confirm password field")
    public void iShouldSeeTheErrorMessageInConfirmPasswordField(String errorMessage) {
        new RegisterPage().getValidationErrorMessageForField(errorMessage);
    }

    @And("I click on female radio button")
    public void iClickOnFemaleRadioButton() {
        new RegisterPage().selectGender("female");

    }

    @And("I enter {string} in first name field")
    public void iEnterInFirstNameField(String firstname) {
        new RegisterPage().enterFirstName(firstname);
    }

    @And("I enter {string} in last name field")
    public void iEnterInLastNameField(String lastname) {
        new RegisterPage().enterLastName(lastname);
    }

    @And("I select {string} day")
    public void iSelectDay(String day,String month, String year) {
        new RegisterPage().selectDateOfBirth(day,month,year);
    }

    @And("I select {string} month")
    public void iSelectMonth(String month) {
    }

    @And("I select {string} year")
    public void iSelectYear(String year) {
    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new RegisterPage().enterEmail(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new RegisterPage().enterPassword(password);
    }

    @And("I enter confirm password {string}")
    public void iEnterConfirmPassword(String confirmPassword) {
        new RegisterPage().enterConfirmPassword(confirmPassword);
    }

    @Then("I should see the registered message {string}")
    public void iShouldSeeTheRegisteredMessage(String message) {
        new RegisterPage().getYourRegCompletedText();
    }
}
