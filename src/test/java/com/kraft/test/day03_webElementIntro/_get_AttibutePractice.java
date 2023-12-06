package com.kraft.test.day03_webElementIntro;

import com.kraft.utilities.WebDriverFactory;
import org.bouncycastle.jcajce.provider.symmetric.Twofish;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _get_AttibutePractice {
    /**
     * Task
     * open chrome browser
     * go to http://www.eurotech.study/
     * click I understand button and accept cookies
     * take the value of the attributes (class and href) of the login button and print the values.
     * click login button
     * send "sdfsdsd" into email address input box
     * click Login button
     * get the message which appears on the email input box
     * VERIFY that the message contains "Please include an '@' in the email address."
     */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://www.eurotech.study/");

        Thread.sleep(2000);

        //lazy way
        driver.findElement(By.id("rcc-confirm-button")).click();
        WebElement firstLoginBtn = driver.findElement(By.xpath("//a[text()='Login']"));
        String aClass = firstLoginBtn.getAttribute("class");
        String aHlass = firstLoginBtn.getAttribute("href");

        System.out.println("aClass = " + aClass);
        System.out.println("aHlass = " + aHlass);

        firstLoginBtn.click();

        WebElement emailBar = driver.findElement(By.id("loginpage-input-email"));
        emailBar.sendKeys("sdfsdsd");

        driver.findElement(By.id("loginpage-form-btn")).click();

        String errorMessage = emailBar.getAttribute("validationMessage");

        System.out.println("errorMessage = " + errorMessage);

        String expectedErrorMessage="Lütfen e-posta adresine bir \"@\" işareti ekleyin. \"sdfsdsd\" adresinde \"@\" eksik.";

        if (errorMessage.contains(expectedErrorMessage))
            System.out.println("pass");
        else
            System.out.println("fail");

        Thread.sleep(2000);


        driver.quit();


    }
}
