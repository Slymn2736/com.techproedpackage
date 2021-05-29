package com.techproedpackage;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
            Create a new class : Day04_GoogleSearchTest
            Create main method and complete the following task.
            When user goes to https://www.google.com/
            Search for “porcelain teapot”
            And print how many related results displayed on Google
         */
public class Day04_Xpath_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\gulsl\\Documents\\Selenium Dependecies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement googleSearchBox = driver.findElement(By.xpath("//input[@name='q']"));
        // Search for "porcelain teapot"
        //Way 1. We can type then press ENTER.Keys.Enter to press Enter
       googleSearchBox.sendKeys("porcelain teapot"+ Keys.ENTER);//Typing "porcelain teapot" ten press Enter
        //         Way 2. We can type then click on search button.
//        googleSearchBox.sendKeys("porcelain teapot");
//        Thread.sleep(3000);
//        WebElement searchButton=driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]"));
//        searchButton.click();

//        And print how many related results displayed on Google
        WebElement result=driver.findElement(By.xpath("//div[@id='result-stats']"));
        System.out.println("RESULT : "+result.getText().substring(6,17));
        driver.quit();



    }
}
