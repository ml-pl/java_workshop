package org.workshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.workshop.pages.MainPage;

import static org.hamcrest.MatcherAssert.assertThat;

public class LoginTest {

    @Test
    public void login() {
        WebDriver driver = new FirefoxDriver();
        new MainPage(driver)
                .clickLoginLink()
                .fillLogin("workshop")
                .fillPassword("test")
                .clickSubmit();
//        driver.get("http://wordpress-keepsake.rhcloud.com/");
//        WebElement zaloguj = driver.findElement(By.linkText("Zaloguj się"));
//        zaloguj.click();
//        WebElement login = driver.findElement(By.id("user_login"));
//        login.sendKeys("workshop");
//        WebElement password = driver.findElement(By.id("user_pass"));
//        password.sendKeys("test");
//        WebElement submit = driver.findElement(By.id("wp-submit"));
//        submit.click();
        WebElement logoutLink = driver.findElement(By.id("wp-admin-bar-my-account"));
        assertThat("user is logged", logoutLink.isDisplayed());
    }
}
