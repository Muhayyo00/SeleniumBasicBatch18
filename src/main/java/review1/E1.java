package review1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class E1 {
    /*Driver commands:
    1.driver.get()
    2.driver.navigate()--->driver.navigate.refresh()
                       ---->driver.navigate.forward()
                       ----->driver.navigate.backward()
    3. driver.manage().window().maximize()
    4.driver.close()
    5.driver.quit()
    6.driver.getTitle()
    7.driver.getCurrentUrl()
         */
    public static void main(String[] args) throws InterruptedException {
        //initiate the instance of WebDriver
        WebDriver driver=new ChromeDriver();
        //maximize the window
        driver.manage().window().maximize();
        //go to facebook.com
        driver.get("https://facebook.com");
        //get the create new account
        WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
        createNewAccount.click();
       //send the name
       // WebElement name=driver.findElement(By.name("firstname"));
       // name.sendKeys("john");
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("john");

    }
}
