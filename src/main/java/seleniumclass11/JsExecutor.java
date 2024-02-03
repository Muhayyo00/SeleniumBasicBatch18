package seleniumclass11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //go to hrms.com
        driver.get("https://syntaxprojects.com/simple_context_menu.php");
        //to draw a boundary around the WebElement
        WebElement hoverBtn=driver.findElement(By.xpath("//button[text()='Hover me!']"));
        //using java script executor
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style','background:green; border:2px solid red;');",hoverBtn);
        //scroll down
        js.executeScript("window.scrollBy(0,1000)");//1000
        Thread.sleep(3000);
        //scroll up
        js.executeScript("window.scrollBy(0,-1000)");//-1000
        js.executeScript("arguments[0].scrollIntoView(true);",hoverBtn);//scrolls to a particular object
        //get the click button
        //WebElement clickBtn=driver.findElement(By.xpath("//button[text()='Right Click!']"));
        // clickBtn.click();//code we use in selenium to click on the button
        WebElement fileUpload=driver.findElement(By.xpath("//a[text()='File Upload']"));
        js.executeScript("arguments[0].click();",fileUpload);
        //google search:js executor script to perform click operation-->find the code for clicking the button
        //sometimes the click button in selenium does not work, in this case we can use js.code to click on it
        // we can do same operations with js as with selenium (open browser, close, .....)

    }
}
