package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumTest_2 {
    public static void main(String[] args) {


        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.microsoft.com");
//
//        System.out.println("--------------------------");
//
//        WebDriverManager.operadriver().setup();
//        WebDriver driver1 = new OperaDriver();
//        driver1.get("https://www.opera.com");




    }
}
