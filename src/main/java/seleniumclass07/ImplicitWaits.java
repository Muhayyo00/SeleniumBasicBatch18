package seleniumclass07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaits {
    public static void main(String[] args) {
        //implicit wait is going to wait until the webElement is found and as soon as it appears, it will move on to the next step
        //Implicit wait is also called a Global Wait. Once you defined it at the beginning of the class, it will be implemented where needed automatically.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-waits.php");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        click on the first button and get the text out of it and display on console
        driver.findElement(By.xpath("//button[@id='show_text_synchronize']")).click();
        WebElement text1 = driver.findElement(By.xpath("//div[@class='card-body']/p"));
        System.out.println(text1.getText());
        //click on button 2 select male
        driver.findElement(By.xpath("//button[@id='show_text_synchronize_02']")).click();
        WebElement text2=driver.findElement(By.xpath("//input[@value='Male']"));
        text2.click();
        //click on button3 select option1
        driver.findElement(By.xpath("//button[@id='show_text_synchronize_03']")).click();
        WebElement text3=driver.findElement(By.xpath("//input[@value='Option-1']"));
        text3.click();
    }
}
