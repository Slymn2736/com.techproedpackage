package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

        /*
            1.Create a new class: VerifyTitleTest
            2.Navigate to google homepage
            3.Verify if google title is “google”
         */
public class Day02_VerifyTitleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\gulsl\\Documents\\Selenium Dependecies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
    //2.Navigate to google homepage
        driver.get("https://www.google.com");
    //3.Verify (expected vs actual) if google title is “google”
        String expected= "google";
        String actual= driver.getTitle();
        //getTitle(); -> Returns the title of the page AS STRING
        //TESTERS DO NOT WRITE A TEST TO PASS
        //TESTERS WRITE A TEST TO CATCH A DEFECT/BUG
        if(expected.equals(actual)){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
            System.out.println("ACTUAL : "+actual);
            System.out.println("EXPECTED : "+expected);
        }
        /*
            NOTE: Test case failed, so we found a bug. Google != google.
            When we find a bug we follow the steps:
            What do you do when you find a bug?
            1. Run the scripts again to make sure the test case is failing
            2. Test the functionality manually to make sure
            3. Communication with BA(write Acceptance Criteria), or Dev, or PO(Providing AC)

            4.Should I open a ticket if that is a bug?
            Follow the company culture
            Some companies we open ticket whenever we find a bug,
            Sometimes it is a quick fix, so we talk to dev to fix it.
            After confirming the bug, we can open ticket and assign to the developer.

            5. What do you do after Dev fix the bug?
            ReTest the application
            Check the reports
            if pass, close the ticket
            If fails again, DO NOT OPEN NEW TICKET, JUST DO NOT CLOSE THE EXISTING TICKET.

            SPRINT: 2 weeks
                What happens if the if the story is not finished in the sprint?
                What happens if a bug cannot be fixed in the sprint?

                This should not normally happen.
                But this can rarely happen due to the not a good planning
                But if we cannot complete a user story, we usually move it to the next sprint.
                If the story is not clear, or need to be refined again, then we move it to the backlog and refined again.
         */

        driver.quit();

    }
}
