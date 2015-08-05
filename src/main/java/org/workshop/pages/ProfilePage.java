package org.workshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

    @FindBy(partialLinkText = "Java Workshop")
    private WebElement mainPageLink;

    private WebDriver driver;

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MainPage goToMainPage() {
        mainPageLink.click();
        return new MainPage(driver);
    }
}
