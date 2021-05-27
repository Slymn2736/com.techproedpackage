package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_BasicNavigations {

    public static void main(String[] args) {

        //1. Setup
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\gulsl\\Documents\\Selenium Dependecies\\drivers\\chromedriver.exe");

        //2. Create driver
        WebDriver driver = new ChromeDriver();

        //3. We write the automation scripts

        //Open google home page https://www.google.com/.
        driver.get("https://www.google.com/");

        driver.navigate().refresh();
        //get("URL"); => takes to the URL
//        On the same class, Navigate to amazon home page https:// www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        //navigate().to("URL") ==> takes to the URL

        //What is the difference between get() and navigate().to() methods?
        //1. get() is shorter and more common
        //2. get() is a little faster
        //3. navigate() has more choice(to(), back(), forward(), refresh())
        //4. get("TYPE STRING") but navigate().to("TYPE URL")

        //Navigate back to google
            driver.navigate().back();
        //Navigate forward to amazon
            driver.navigate().forward();
        //Refresh the page
            driver.navigate().refresh();
        // Maximize the window
            driver.manage().window().maximize();
        //Close/Quit the browser
        //    driver.close();
        //close()

            driver.quit();

    }
}
