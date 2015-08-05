package org.workshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.workshop.model.Credentials;
import org.workshop.pages.LoginPage;
import org.workshop.pages.MainPage;
import org.workshop.pages.ProfilePage;
import org.workshop.scenarios.LoginScenario;

import static org.hamcrest.MatcherAssert.assertThat;

public class LoginTest {

    @Test
    public void login() {
        WebDriver driver = new FirefoxDriver();

        LoginPage loginPage = new MainPage(driver).clickLoginLink();

        ProfilePage profilePage = new LoginScenario(new Credentials("workshop", "test")).login(loginPage);

        WebElement logoutLink = driver.findElement(By.id("wp-admin-bar-my-account"));
        assertThat("user is logged", logoutLink.isDisplayed());

        MainPage mainPage = profilePage.goToMainPage();
        mainPage.openPost("Witaj, świecie!");

    }
}
