package org.workshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    @FindBy(id = "user_login")
    private WebElement loginField;

    @FindBy(id = "user_pass")
    private WebElement passwordField;

    @FindBy(id = "wp-submit")
    private WebElement submitButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LoginPage fillLogin(String login){
        loginField.sendKeys(login);
        return this;
    }

    public LoginPage fillPassword(String password){
        passwordField.sendKeys(password);
        return this;
    }

    public ProfilePage clickSubmit(){
        submitButton.click();
        return new ProfilePage(driver);
    }
}
