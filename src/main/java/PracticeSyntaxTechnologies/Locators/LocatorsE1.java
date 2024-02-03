package PracticeSyntaxTechnologies.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsE1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/input-form-locator.php");
        WebElement fName=driver.findElement(By.id("first_name"));
        fName.sendKeys("Michael");
        Thread.sleep(2000);
        WebElement lName=driver.findElement(By.name("last_name"));
        lName.sendKeys("Jordan");
        Thread.sleep(2000);
        WebElement eMail=driver.findElement(By.name("email"));
        eMail.sendKeys("mjordan@gmail.com");
        Thread.sleep(2000);
        WebElement submitBtn=driver.findElement(By.id("submit_button"));
        submitBtn.click();
        Thread.sleep(2000);
        WebElement clickBtn=driver.findElement(By.partialLinkText("Click"));
        clickBtn.click();
        WebElement link=driver.findElement(By.linkText("Link"));
        link.click();


    }
}
