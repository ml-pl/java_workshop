package org.workshop.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.workshop.framework.pages.Todos;

import static org.testng.Assert.assertEquals;


public class TodosTest {

    @Test
    public void openAndCountTodos() {
        WebDriver driver = new FirefoxDriver();
        assertEquals(2, Todos.openTodos(driver).numberOfTodos());
    }
}
