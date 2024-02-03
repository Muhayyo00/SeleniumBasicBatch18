package seleniumclass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
    public static void main(String[] args) {

        /* Syntax for xpath:
        /body/div/hello/this/is/--->absolute xpath
        //tag[@id='userName']-->relative xpath

        Xpath Vs Css
        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Hello")-Xpath
        driver.findElement(By.cssSelector("inout[id='userName']")).sendKeys("Good Class");-Css
         */
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        //go to syntax projects.com
        driver.get("https://syntaxprojects.com/Xpath.php");
        //finding the input box username
        WebElement username=driver.findElement(By.xpath("//input[@id='title']"));
        username.sendKeys("abracadabra");
       //finding the button
        WebElement button=driver.findElement(By.xpath("//button[text()='Click Here']"));
        button.click();
        //find the security question
        WebElement q1=driver.findElement(By.xpath("//input[contains(@name,'securityPartial')]"));
        q1.sendKeys("What is your name?");
        //find the text and print it on console
        WebElement textMsg=driver.findElement(By.xpath("//label[contains(text(),' Lorem ipsum')]"));
        String text=textMsg.getText();
        System.out.println(text);
        //send the api settings
        WebElement apiSettings= driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]"));
        apiSettings.sendKeys("Pororo");
        //send the email 2
        WebElement email2= driver.findElement(By.className("(//input[@class='form-control backup'])[2]"));
        email2.sendKeys("mnsvabdmavd@gmail.com");
        //send the field 2
        WebElement field2=driver.findElement(By.xpath("//input[@data-detail='two' and @name='customField']"));
        field2.sendKeys("Astalavista");

    }
}
