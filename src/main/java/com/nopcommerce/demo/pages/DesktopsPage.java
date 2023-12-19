package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    public DesktopsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Desktops']")
    WebElement desktopText;

    @CacheLookup
    @FindBy(xpath = "//select[@aria-label='Select product sort order']")
    WebElement sortByMenu;

    @CacheLookup
    @FindBy(xpath = "//select[@aria-label='Select number of products per page']")
    WebElement displayMenu;

    @CacheLookup
    @FindBy(xpath = "//div[@class='products-container']//h2/a")
    List<WebElement> productTitleList;


    public String getDesktopText() {
        log.info("getting desktop Text " + desktopText.toString());
        return getTextFromElement(desktopText);
    }

    public void selectSortBy(String sortby) {
        selectByVisibleTextFromDropDown(sortByMenu, sortby);
        log.info("Selecting sortby " + sortby + " from dropdown " + sortByMenu.toString());
    }

    public void selectDisplayMenu(String display) {
        selectByVisibleTextFromDropDown(displayMenu, display);
        log.info("Selecting display " + display + " from dropdown " + displayMenu.toString());
    }

    public void selectProduct(String productName) {
        for (WebElement product : productTitleList) {
            if (product.getText().equals(productName)) {
                log.info("Click on product '" + productName + "' : " + product.getText() + "<br>");
                clickOnElement(product);
            }
        }
    }

}
