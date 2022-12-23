package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class SeleniumTest {
    public static void main(String[] args) {

        //1. Setting up the web driver manager

        WebDriverManager.chromedriver().setup();
        //2. Create instance of the chrome driver

        WebDriver driver = new ChromeDriver();

        //3. Test if driver is working as expected

        driver.get("https://www.google.com");

        System.out.println("------------------------------");

        WebDriverManager.operadriver().setup();
        WebDriver driver1 = new OperaDriver();
        driver1.get("https://www.opera.com");

    }
}
