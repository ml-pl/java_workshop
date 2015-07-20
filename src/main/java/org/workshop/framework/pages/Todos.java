package org.workshop.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Todos {

    private static final String TODOS_URL = "https://4f9dd9c8d09bb99b2f35140a6407b1f7c78eab55-www.googledrive.com/host/0B5NZZYfG34yucFRfVFFSQTRhUm8";

    public static Todos openTodos(WebDriver driver) {
        driver.get(TODOS_URL);
        return PageFactory.initElements(driver, Todos.class);
    }

    public int numberOfTodos() {
        throw new NotImplementedException();
    }
}
