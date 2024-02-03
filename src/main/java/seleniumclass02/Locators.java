package seleniumclass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {

        /* There are 8 types of locators:
        1.ID
        2.Name
        3.Class/class name
        4.Tag name
        5.Link Text (you can you linkText ONLY if there is "a" tag, and it has some text)
        6.Partial Link Text(used when the text has some numbers in link Text OR if it is very long)
        7.Xpath
        8.Css
        We use multiple locators, because:
        1.some of the locators might not be available
        2.sometimes the locator value might not be unique enough
        AVOID:numbers and spaces when choosing the locators and their values

        If you find a webElement and you try to print the webElement on the console,
        it will print the webElement.

        If you to print a text out of it, you will write .getText();

        WebElement commands:
        g.click();
        g.sendKeys();
        g.getText();
        */
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com");
        //find the WebElement input email and send ur email address to it
        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("abracadabra@gmail.com");
        //find the element password and send the password
        WebElement password=driver.findElement(By.name("pass"));
        password.sendKeys("hellooooo123");
        //find the element button login
        WebElement login= driver.findElement(By.name("login"));
        //login.click();
        //go to button create new account and click on it
        //WebElement createAccount=driver.findElement(By.linkText("Create new account"));
        //createAccount.click();
        WebElement createAccount=driver.findElement((By.partialLinkText("new account")));
        createAccount.click();


    }
}
