package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_FirstSeleniumClass {
    //1. Create main method in Java class
    public static void main(String[] args) {

        //2.system.setProperty("DRIVER TYPE","DRIVER PATH")
        // DRIVER TYPE FOR CHROME: webdriver.chrome.driver
        //DRIVER PATH:C:\Users\gulsl\Documents\Selenium Dependecies\drivers\chromedriver_win32
        //WINDOWS USER: use chromedriver.exe EXTENSION
        System.setProperty("webdriver.chrome.driver","C:\\Users\\gulsl\\Documents\\Selenium Dependecies\\drivers\\chromedriver_win32\\chromedriver.exe");

        //3. Create WebDriver Object
        WebDriver driver = new ChromeDriver();
        //Note: If selenium libraries are not imported, then import the selenium libraries once

        // Step 1, 2, 3 are mandatory for java automation framework.

        //4. Now that we are done with setup, we can rite automation script.
        driver.get("https://www.google.com");

    }
}
