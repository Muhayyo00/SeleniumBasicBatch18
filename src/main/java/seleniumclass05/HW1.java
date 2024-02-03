package seleniumclass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        //click on enable checkboxes and select checkbox 1 and 5
        WebDriver webdriver=new ChromeDriver();
        webdriver.manage().window().maximize();
        webdriver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        WebElement enable=webdriver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        enable.click();
        Thread.sleep(2000);
        List<WebElement>checkboxes=webdriver.findElements(By.xpath("//input[@class='checkbox-field']"));
        for(WebElement w:checkboxes){
            String checkbox =w.getAttribute("value");
            if(checkbox.equals("Checkbox-1")||checkbox.equals("Checkbox-4")){
                w.click();
            }
        }

    }
}
