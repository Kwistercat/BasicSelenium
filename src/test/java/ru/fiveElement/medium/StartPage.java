package ru.fiveElement.medium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class StartPage extends BasePage{
    private WebElement searchField;

    public StartPage() {
        PageFactory.initElements(driver,this);
    }

}
