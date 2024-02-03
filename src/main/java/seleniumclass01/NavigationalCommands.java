package seleniumclass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
    public static void main(String[] args) throws InterruptedException {

        /*Difference between GET and NAVIGATE
        1.Get is going to wait for the whole page to load, but navigate no.
        2.Get doesn't keep the history, but navigate does.
         */

        //maximize-we can still see the top bar-->driver.manage().window().maximize();maximize the screen
        //fullscreen-we cannot see the top bar-->driver.manage().window().fullscreen();fullscreen mode
        //driver.getTitle()-->gets the title of the website
        //driver.getCurrentUrl()-->gets the current url of the website
        //driver.close()-->driver closes
        //driver.quit()-->quit the browser
        //driver.navigate().back()--> goes back to previous page
        //driver.navigate().refresh()--> refreshes the page

        /*Difference between CLOSE and QUIT
        CLOSE-closes the current window
        QUIT-closes the whole browser no matter how many windows are opened up
         */

       //initiate the instance of WebDriver

        /* WebDriver commands:
        driver.get();
        driver.navigate()
        driver.maximize();
        driver.getTitle();
        driver.getUrl();
         */
        WebDriver driver=new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
        //go to google.com
        driver.get("https://www.google.com");

        //facebook.com
        driver.navigate().to("https://www.fb.com");
        //go back to google.com
        driver.navigate().back();
        Thread.sleep(4000);
        driver.navigate().forward();
        //refresh
        Thread.sleep(4000);
        driver.navigate().refresh();
        driver.close();






    }
}
