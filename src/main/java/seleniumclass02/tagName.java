package seleniumclass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //go to amazon.com
        driver.get("https://syntaxprojects.com/input-form-locator.php");
        WebElement button=driver.findElement(By.tagName("button"));
        button.click();

//to be continued


    }
}
