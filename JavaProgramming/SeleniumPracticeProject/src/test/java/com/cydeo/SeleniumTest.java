package com.cydeo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class SeleniumTest {
    public static void main(String[] args) {

        //1. setting up the web driver manager
     //   WebDriverManager.chromiumdriver().setup();
     System.setProperty("webdriver.chrome.driver","D:\\Documents\\IdeaProjects\\JavaProgramming\\SeleniumPracticeProject\\chromedriver.exe");
        //2.Create instance of the chrome driver
       WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");


   System.setProperty("webdriver.opera.driver","D:\\Documents\\IdeaProjects\\JavaProgramming\\SeleniumPracticeProject\\operadriver_win64\\operadriver_win64\\operadriver.exe");
   WebDriver driver1 = new OperaDriver();
   driver1.get("https://www.facebook.com");


        System.out.println("-------------------------------------------------");

       System.setProperty("webdriver.edge.driver","D:\\Documents\\IdeaProjects\\JavaProgramming\\SeleniumPracticeProject\\msedgedriver.exe");
        WebDriver driver2 = new EdgeDriver();
        driver2.get("https://www.microsoft.com");







    }
}
