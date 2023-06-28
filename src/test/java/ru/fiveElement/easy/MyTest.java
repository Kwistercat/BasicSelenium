package ru.fiveElement.easy;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest {

    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\BasicSelenium\\BasicSelenium\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void errorTextSearchNotFoundTest() {
        driver.get("https://5element.by/");
        WebElement searchField = driver.findElement(By.xpath("//*[@id=\"app\"]/header//form[2]/input[2]"));
        searchField.sendKeys("ТЕЛЕВИЗОР АНДРОИД", Keys.ENTER);
        WebElement errorText = driver.findElement(By.xpath("//div[text() = 'К сожалению, страница не найдена (ошибка 404)']"));
        Assert.assertEquals("К сожалению, страница не найдена (ошибка 404)", errorText.getText());
    }


    @After
    public void tearDown() {
        driver.quit();
    }

}
