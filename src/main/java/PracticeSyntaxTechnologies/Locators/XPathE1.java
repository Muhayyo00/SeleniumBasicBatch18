package PracticeSyntaxTechnologies.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathE1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/Xpath.php");
        WebElement userName=driver.findElement(By.xpath("//input[@name='exactUserEntry']"));
        userName.sendKeys("Michael");
        WebElement clickHere=driver.findElement(By.xpath("//button['Click Here']"));
        clickHere.click();
        WebElement sQuestion1=driver.findElement(By.xpath("//input[contains(@name,'security')]"));
        sQuestion1.sendKeys("Which city were you born?");
        WebElement text=driver.findElement(By.xpath("//label[contains(text(),'Lorem ipsum')]"));
        String str=text.getText();
        System.out.println(str);
        WebElement apiSet=driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]"));
        apiSet.sendKeys("Ycc234556");
        WebElement email1=driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        email1.sendKeys("pororo1@gmail.com");
        WebElement email2=driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        email2.sendKeys("pororo2@gmail.com");
        WebElement email3=driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        email3.sendKeys("pororo3@gmail.com");
        WebElement field1=driver.findElement(By.xpath("//input[@name='customField' and @data-detail='one']"));
        field1.sendKeys("field-One");
        WebElement field2=driver.findElement(By.xpath("//input[@name='customField' and @data-detail='two']"));
        field2.sendKeys("field-Two");
        WebElement fieldOne1=driver.findElement(By.xpath("//input[contains(@name,'customField1')]"));
        fieldOne1.sendKeys("field1-One");
        WebElement fieldOne2= driver.findElement(By.xpath("//input[contains(@data-detail,'two') and contains(@name,'customField1')]"));
        fieldOne2.sendKeys("field1-Two");



    }
}
