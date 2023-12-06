package com.kraft.test.day_02_webDriverBasics;

import com.kraft.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class _4_CallSWebDriverFactory {
    /**
     * set up a chrome driver with WebDriverFactory
     * navigate to https://tr-tr.facebook.com/
     * verify that the url is correct
     */
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        driver.get("https://tr-tr.facebook.com/");
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://tr-tr.facebook.com/";
        if (actualUrl.equals(expectedUrl))
            System.out.println("pass");
        else
            System.out.println("faıl");
        driver.close();
    }
}
