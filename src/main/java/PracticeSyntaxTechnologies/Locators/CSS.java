package PracticeSyntaxTechnologies.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector.php");
        WebElement profileID= driver.findElement(By.cssSelector("input#profileID"));
        profileID.sendKeys("TTU354467");
        WebElement profile=driver.findElement(By.cssSelector("input#profileBox"));
        profile.sendKeys("T97458663");
WebElement fFromJenny=driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
fFromJenny.sendKeys("Hi From Jenny!");
WebElement fFromRaj=driver.findElement(By.cssSelector("input[class*='feedbackBox2']"));
        fFromRaj.sendKeys("Hello From Raj!");
WebElement email=driver.findElement(By.cssSelector("input[name^='email']"));
email.sendKeys("email#123@gmail.com");
WebElement courseTopic=driver.findElement(By.cssSelector("input[name^='23content']"));
courseTopic.sendKeys("Java");
WebElement AdvancedCss=driver.findElement(By.cssSelector("input[name$='IntroInput556']"));
AdvancedCss.sendKeys("This is an Advanced Css");
WebElement conclusion=driver.findElement(By.cssSelector("input[name*='45conclusion345Input']"));
conclusion.sendKeys("This is a conclusion");
    }
}
