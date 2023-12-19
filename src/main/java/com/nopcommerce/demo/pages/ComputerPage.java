package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {

        private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

        public ComputerPage() {
            PageFactory.initElements(driver, this);
        }

        @CacheLookup
        @FindBy(xpath = "//h1[text()='Computers']")
        WebElement computerText;

        @CacheLookup
        @FindBy(xpath = "//h2[@class='title']//a[text()=' Desktops ']")
        WebElement deskTopLink;

        @CacheLookup
        @FindBy(xpath = "//h2[@class='title']//a[text()=' Notebooks ']")
        WebElement noteBooksLink;

        @CacheLookup
        @FindBy(xpath = "//h2[@class='title']//a[text()=' Software ']")
        WebElement softwareLink;

        @CacheLookup
        @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
        WebElement comuterLink;

        public void clickOnComputerLink(){
            clickOnElement(comuterLink);
        }

        public String getComputerText(){
            log.info("getting computer Text " + computerText.getText());
            return getTextFromElement(computerText);
        }
        public void clickOnDeskTopLink(){
            clickOnElement(deskTopLink);
            log.info("Clicking on deskTop "+ deskTopLink.toString());
        }
        public void clickOnNoteBooksLink(){
            clickOnElement(noteBooksLink);
            log.info("Clicking on noteBooks "+ noteBooksLink.toString());
        }
        public void clickOnSoftwareLink(){
            clickOnElement(softwareLink);
            log.info("Clicking on software "+ softwareLink.toString());
        }

    }

