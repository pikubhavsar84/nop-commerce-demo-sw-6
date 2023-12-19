package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginPageSteps {
    @Given("I click on the login link")
    public void iClickOnTheLoginLink() {
    new HomePage().clickOnLoginLink();
    }

    @Then("verify that {string} message display")
    public void verifyThatMessageDisplay(String message) {
        Assert.assertEquals(new LoginPage().getWelcomeText(),message);
    }

    @Given("I open the application")
    public void iOpenTheApplication() {
    }

    @And("I enter {string} in the email field")
    public void iEnterInTheEmailField(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("I enter {string} in the password field")
    public void iEnterInThePasswordField(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on the login button")
    public void iClickOnTheLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should see the {string} error message")
    public void iShouldSeeTheErrorMessage(String errorMessage) {
        Assert.assertEquals(new LoginPage().getErrorMessage(),errorMessage);
    }

    @Then("I should see the logout link")
    public void iShouldSeeTheLogoutLink() {
        new LoginPage().clickonlogout();
    }

    @When("I click on the logout link")
    public void iClickOnTheLogoutLink() {
        new LoginPage().clickonlogout();
    }

    @Then("I should see the login link")
    public void iShouldSeeTheLoginLink() {
        new HomePage().clickOnLoginLink();
    }

}
