package org.workshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    private static String url = "http://wordpress-keepsake.rhcloud.com/";

    @FindBy(linkText = "Zaloguj się")
    private WebElement loginLink;

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        driver.get(url);
        PageFactory.initElements(driver, this);
    }

    public LoginPage clickLoginLink() {
        loginLink.click();
        return new LoginPage(driver);
    }

}
