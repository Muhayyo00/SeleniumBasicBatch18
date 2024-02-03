package seleniumclass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAccount {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com");

        WebElement createAccount=driver.findElement(By.linkText("Create new account"));
        createAccount.click();
        Thread.sleep(2000);
        WebElement firstName=driver.findElement(By.name("firstname"));
        firstName.sendKeys("Kono");
        WebElement lastName= driver.findElement(By.name("lastname"));
        lastName.sendKeys("Dono");
        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("konodono21@gmail.com");
        WebElement password=driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("lalala2019");
        driver.close();






    }
}
