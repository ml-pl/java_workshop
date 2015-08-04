package org.workshop.framework.pages;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class Todos {

    private static final String TODOS_URL = "https://4f9dd9c8d09bb99b2f35140a6407b1f7c78eab55-www.googledrive.com/host/0B5NZZYfG34yucFRfVFFSQTRhUm8";

    @FindBy(css = "li span")
    private List<WebElement> todos;

    @FindBy(css = "input[type='submit']")
    private WebElement addButton;

    @FindBy(css = "input[type='text']")
    private WebElement descriptionText;

    public static Todos openTodos(WebDriver driver) {
        driver.get(TODOS_URL);
        return PageFactory.initElements(driver, Todos.class);
    }

    public int numberOfTodos() {
        return todos.size();
    }

    public Todos addTodo(String description){
        descriptionText.clear();
        descriptionText.sendKeys(description);
        addButton.click();
        return this;
    }

    /**
     * This method should verify both number of items showing on page and the number of items shown above list items.
     */
    public Todos verifyCountOfTodos(int expected) {
        assertThat(numberOfTodos(), equalTo(expected));
        return this;
    }
}
