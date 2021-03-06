package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
        1.Create a new class : Review1
        2.Using ChromeDriver, Go to youtube and verify if page title is “youtube”, If not, print the correct title.
        3.Verify if the page URL contains youtube if not, print the right url.
        4.Then Navigate to https://www.amazon.com/
        5.Navigate back to youtube
        6.Refresh the page
        7.Navigate forward to amazon
        8.Maximize the window
        9.Then verify if page title includes “Amazon”, If not, print the correct title.
        10.Verify if the page URL is https://www.amazon.com/, if not print the correct url
        11.Quit the browser
     */
public class Day02_Review1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\gulsl\\Documents\\Selenium Dependecies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //Maximize the window
        driver.manage().window().maximize();
        //Using ChromeDriver, Go to youtube and verify if page title is “youtube”, If not, print the correct title.
        driver.get("https://www.youtube.com/");
        Thread.sleep(5000);
        String actualYoutubeTitle = driver.getTitle();
        String expectedYoutubeTitle= "youtube";
        if (actualYoutubeTitle.equals(expectedYoutubeTitle)) {
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("Actual Youtube Title : " + actualYoutubeTitle+"\nExpected Youtube Title: " + expectedYoutubeTitle);
        }

        //Verify if the page URL contains youtube if not, print the right url.
        String actualYoutubeURL = driver.getCurrentUrl();
        String expectedYoutubeURL = "youtube";
            if (actualYoutubeURL.contains(expectedYoutubeURL)){
                System.out.println("PASS");
            }else{
                System.out.println("FAIL");
                System.out.println("CORRECT URL : "+actualYoutubeURL);
        }
            //Then Navigate to https://www.amazon.com/
            driver.navigate().to("https://www.amazon.com/");
            //Navigate back to youtube
            driver.navigate().back();
            Thread.sleep(3000);
            //Refresh the page
            driver.navigate().refresh();
            Thread.sleep(5000);
            //Navigate forward to amazon
            driver.navigate().forward();

            //Then verify if page title includes “Amazon”, If not, print the correct title.
        if (driver.getTitle().contains("Amazon")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Amazon Title : "+driver.getTitle() );
        }
            //Verify if the page URL is https://www.amazon.com/, if not print the correct url
        if (driver.getCurrentUrl().equals("https://www.amazon.com/")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Correct URL : "+driver.getCurrentUrl());
        }

        driver.close();
    }
}
