package seleniumclass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    public static void main(String[] args) {
        //click on enable button and
        //check if the male radio button is enabled
        //if yes click on it
        WebDriver webdriver=new ChromeDriver();
        webdriver.manage().window().maximize();
        webdriver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement enableBtn=webdriver.findElement(By.xpath("//button[@id='enabledradio']"));
        enableBtn.click();
        WebElement enableMaleBtn= webdriver.findElement(By.xpath("//input[@name='gender-identity' and @value='gender-male']"));
        enableMaleBtn.click();

        if(enableMaleBtn.isEnabled()){
            System.out.println("Male radio button is enabled and clicked");
        }else{
            System.out.println("Male radio button is not enabled");
        }
    }
}
