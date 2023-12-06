package com.kraft.test.day03_webElementIntro;

import com.kraft.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _1_VerifyUrllsNotChanged {
    /**
     * Task
     * open chrome browser
     * go to https://demoqa.com/login
     * click on login button
     * VERIFY that url is not changed
     */
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://demoqa.com/login");

        String expectedUrl="https://demoqa.com/login";
        driver.manage().window().maximize();

        WebElement loginbtn = driver.findElement(By.id("login"));
        loginbtn.click();

        String actualUrl=driver.getCurrentUrl();

        if (actualUrl.equals(expectedUrl))
            System.out.println("pass");
        else
            System.out.println("fail");

        driver.close();



    }
}
