package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


/*
    By.id             =>driver.findElement(By.id(""));
    By.name           =>driver.findElement(By.name(""));
    By.className      =>driver.findElement(By.className(""));
    By.tagName        =>driver.findElements(By.tagName(“"));
    By.linkText       =>driver.findElement(By.linkText(""));
    By.partialLinkText =>driver.findElement(By.partialLinkText(""));
    By.xpath           =>driver.findElement(By.xpath(""));
    By.css            =>driver.findElement(By.css(""));
 */
    /*
        Create a class : LocatorsIntro
        Create main method and complete the following task.
        1. user goes to http://a.testaddressbook.com/sign_in
        Locate the elements of email textbox, password textbox, and sign in button
        Enter below username and password then click sign in button
        Username :  testtechproed@gmail.com
        Password : Test1234!
        Then verify that the expected user id  testtechproed@gmail.com
            (USE getText() method to get the text from the page)
        Verify the Addresses and Sign Out  texts are displayed
        Find the number of total link on the pag
        Sign out from the page
     */
public class Day03_LocatorsIntro {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\gulsl\\Documents\\Selenium Dependecies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

//       1.user goes to http://a.testaddressbook.com/sign_in
        driver.get(" http://a.testaddressbook.com/sign_in");
        driver.manage().window().maximize();
//      Locate the elements of email textbox, password textbox, and sign in button
//       Enter below username and password then click sign in button
//        Username :  testtechproed@gmail.com
//        Password : Test1234!
        WebElement emailTextbox=driver.findElement(By.id("session_email"));
        emailTextbox.sendKeys(" testtechproed@gmail.com");
        //sendKeys()==> types inside the input box

        WebElement passwordTextbox= driver.findElement(By.id("session_password"));
        passwordTextbox.sendKeys("Test1234!");

        WebElement signinButton = driver.findElement(By.name("commit"));
        signinButton.click();//click() used to click on the elements

//SO FAR WE AUTOMATED LOGIN FUNCTIONALITY OF THE APPLICATION

        Thread.sleep(3000);
//        Then verify that the expected user id  testtechproed@gmail.com
//         (USE getText() method to get the text from the page)
        WebElement userId=driver.findElement(By.className("navbar-text"));
        String userIdText=userId.getText();// getText() returns text of the element as String
        String expectedUseId="testtechproed@gmail.com";
        if (userIdText.equals(expectedUseId)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL ID : "+userIdText);
            System.out.println("EXPECTED ID : "+expectedUseId);
        }

//        Verify the Addresses and Sign Out  texts are displayed
       WebElement addresses = driver.findElement(By.partialLinkText("Addresses"));
        if(addresses.isDisplayed()){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("Element is Displayed : "+addresses.isDisplayed());
        }
        WebElement signout = driver.findElement(By.partialLinkText("Sign out"));
        if(signout.isDisplayed()){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("Element is Displayed : "+signout.isDisplayed());
        }
//        Find the number of total link on the pag
       List<WebElement> allLinks= driver.findElements(By.tagName("a"));
        System.out.println("There are " +allLinks.size()+ " links on the page");

//        Sign out from the page
        driver.findElement(By.linkText("Sign out")).click();

        WebElement homeLink = driver.findElement(By.partialLinkText("Home"));
        if(homeLink.isDisplayed()){
            System.out.println("Sign out is Success");
        }else {
            System.out.println("Sign Out is Failed");
        }

        driver.quit();

    }
}
