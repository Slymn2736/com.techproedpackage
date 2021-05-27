package com.techproedpackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
            1.Create a new class: VerifyURLTest
            2.Navigate to google homepage
            3.Verify if google homepage url is “www.google.com”
         */
public class Day02_VerifyURLTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\gulsl\\Documents\\Selenium Dependecies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //2.Navigate to google homepage
        driver.get("https://www.google.com");

        //3.Verify if google homepage url is “www.google.com”
            String expectedURL= "www.google.com";
            String actualURL= driver.getCurrentUrl();

                if(expectedURL.equals(actualURL)){
                    System.out.println("PASS");
                }else{
                    System.out.println("FAIL");
                    System.out.println("Actual URL : "+actualURL);
                    System.out.println("Expected URL : "+expectedURL);
                }

                driver.quit();

    }
}
