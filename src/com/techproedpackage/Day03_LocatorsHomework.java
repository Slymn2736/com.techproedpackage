package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03_LocatorsHomework {
    public static void main(String[] args) {
        /*
            Go to http://automationpractice.com/index.php
            Click on Sign in link
            Enter you email (you can create a fake email and use that email)
            And click on Create an account link
            And Verify the CREATE AN ACCOUNT isDisplayed() on the page
            And Verify the YOUR PERSONAL INFORMATION isDisplayed() on the page
         */
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\gulsl\\Documents\\Selenium Dependecies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

// Go to http://automationpractice.com/index.php
        driver.get("http://automationpractice.com/index.php");
//Click on Sign in link
        WebElement signIn = driver.findElement(By.className("login"));
        signIn.click();
//Enter your email (you can create a fake email and use that email(sgul.tester@gmail.com))
        WebElement emailBox = driver.findElement(By.id("email_create"));
        emailBox.sendKeys("sgul.tester@gmail.com");
//And click on Create an account link
        WebElement createAccount = driver.findElement(By.id("SubmitCreate"));
        createAccount.click();

//And Verify the CREATE AN ACCOUNT isDisplayed() on the page
        WebElement createAnAccount = driver.findElement(By.className("page-heading"));
        if (createAccount.isDisplayed()) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Element is Displayed : "+ createAnAccount.isDisplayed());
        }

//And Verify the YOUR PERSONAL INFORMATION isDisplayed() on the page
        WebElement yourPersonalInfo = driver.findElement(By.className("page-subheading"));
        if (yourPersonalInfo.isDisplayed()) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Element is Displayed : "+ yourPersonalInfo.isDisplayed());
        }

        driver.quit();
    }
}
