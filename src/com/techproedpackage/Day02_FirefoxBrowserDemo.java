package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day02_FirefoxBrowserDemo {
    public static void main(String[] args) {
    /*
            Create a new class under : FirefoxBrowserDemo Create main method
     */
        //Set Path
        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\gulsl\\Documents\\Selenium Dependecies\\drivers\\geckodriver.exe");

        //Create gecko driver
        // We are using Polymorphism when we are creating a driver
            WebDriver driver = new FirefoxDriver();
        //Open google home page https://www.google.com/
            driver.get("https://www.google.com/");
        //Maximize the window
            driver.manage().window().maximize();
            driver.navigate().refresh();
        //Close/Quit the browser
            driver.quit();


    }
}
