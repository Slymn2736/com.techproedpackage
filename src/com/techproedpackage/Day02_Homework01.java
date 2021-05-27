package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    /*
        2.Maximize the window
        3.Using ChromeDriver, Go to facebook and verify if page title is “facebook”, If not, print the correct title.
        4.Verify if the page URL contains facebook if not, print the right url.
        5.Then Navigate to https://www.walmart.com/
        6.Verify if the walmart page title includes “Walmart.com”
        7.Navigate back to facebook
        8.Refresh the page
        9.Close the browser
     */
public class Day02_Homework01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\gulsl\\Documents\\Selenium Dependecies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
    //2.Maximize the window
        driver.manage().window().maximize();
    //3.Using ChromeDriver, Go to facebook and verify if page title is “facebook”, If not, print the correct title.
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        String expectedTitle = "facebook";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Actual Title : "+actualTitle);
            System.out.println("Expected Title : "+expectedTitle);
        }
    // 4.Verify if the page URL contains facebook if not, print the right url.
        String actualFacebookURL = driver.getCurrentUrl();
        String expectedFacebookURL = "facebook";
        if(actualFacebookURL.contains(expectedFacebookURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Correct URL : "+actualFacebookURL);
        }
    //5.Then Navigate to https://www.walmart.com/
        driver.navigate().to("https://www.walmart.com/");
    //6.Verify if the walmart page title includes “Walmart.com”
        if(driver.getTitle().contains("Walmart.com")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Walmart Title : "+ driver.getTitle());
        }
    //7.Navigate back to facebook
        driver.navigate().back();
        //8.Refresh the page
        driver.navigate().refresh();

        driver.close();
    }
}
