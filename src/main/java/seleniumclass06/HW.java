package seleniumclass06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        WebElement promptBox=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        promptBox.click();
        Thread.sleep(2000);
        Alert alertHandler=driver.switchTo().alert();
        alertHandler.sendKeys("Pororo");
        alertHandler.accept();


    }
}
