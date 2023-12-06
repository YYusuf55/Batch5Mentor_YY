package com.kraft.test.day_02_webDriverBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3_GetMethods {
    public static void main(String[] args) {

        /**
         * set up a chrome driver
         * navigate to https://www.hepsiburada.com/
         * get title and get url get page source code
         * verify that title, url and Page source codes  contain "hepsiburada"
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        String actualTitle= driver.getTitle();  //sayfanın başlıgını alır

        String actualURL= driver.getCurrentUrl(); //selenimun üzerinde bulunduğu sayfanın URLini alır.

        String actualSouRCEcODE=driver.getPageSource();

        if (actualTitle.toLowerCase().contains("hepsiburada")&&actualURL.toLowerCase().contains("hepsiburada")
        &&actualSouRCEcODE.toLowerCase().contains("hepsiburada")){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

    }
}
