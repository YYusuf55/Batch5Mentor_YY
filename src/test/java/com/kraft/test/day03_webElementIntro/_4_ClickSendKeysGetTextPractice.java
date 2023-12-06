package com.kraft.test.day03_webElementIntro;

import com.kraft.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _4_ClickSendKeysGetTextPractice {
    public static void main(String[] args) {
        /**
         * Open chore browser
         * navigate to https://www.amazon.com/
         * write "Java" to the search bar
         * click search button
         * get result for text
         * verify that the text contains "Java"
         */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");

        WebElement searcBar = driver.findElement(By.name("field-keywords"));
        searcBar.sendKeys("Java");
        driver.findElement(By.id("nav-search-submit-button")).click();
        WebElement seacrchResult = driver.findElement(By.cssSelector("[class='a-color-state a-text-bold']"));
        String actualText=seacrchResult.getText();
        String expectedtext="Java";

        System.out.println("actualText = " + actualText);

        if (actualText.contains(expectedtext))
            System.out.println("pass");
        else
            System.out.println("fail");


    }
}
