package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComputerSteps {
    @Then("I should see the {string} text message computer page")
    public void iShouldSeeTheTextMessageComputerPage(String arg0) {

    }

    @When("I click on computer link")
    public void iClickOnComputerLink() {
        new ComputerPage().clickOnComputerLink();
    }

    @And("I click on desktop link")
    public void iClickOnDesktopLink() {
        new ComputerPage().clickOnDeskTopLink();
    }

    @Then("I should see the {string} text message desktop page")
    public void iShouldSeeTheTextMessageDesktopPage(String message) {
        new ComputerPage().getComputerText();
    }

    @And("I click on build computer link")
    public void iClickOnBuildComputerLink() {
        new BuildYourOwnComputerPage().clickBuildComputer();
    }

    @And("I select {string} processor")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("I select {string} hdd button")
    public void iSelectHddButton(String hdd) {
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("I select {string} ram")
    public void iSelectRam(String ram) {
        new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("I select {string} os")
    public void iSelectOs(String os) {
        new BuildYourOwnComputerPage().selectOS(os);
    }

    @And("I select {string} software")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("I should see the {string} success message")
    public void iShouldSeeTheSuccessMessage(String message) {
        new BuildYourOwnComputerPage().getProductAddedMessage();
    }
}
