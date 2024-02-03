package seleniumclass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) {
        /* SHORTCUTS
        #-->id-->Tagname#value
        .-->classname-->Tagname.value
        *-->contains-->Tagname[attribute*='value']
        ^-->starts-with-->Tagname[attribute^='value']
        $-->ends-with-->Tagname[attribute$='value']
         */
        WebDriver driver=new ChromeDriver();
//go to syntax projects.com
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector.php");
        //find the username text box
        WebElement inputBox=driver.findElement(By.cssSelector("input[id='profileID']"));
        inputBox.sendKeys("hello");
        //find the profile box
        WebElement profileBox=driver.findElement(By.cssSelector("input#profileBox"));
        profileBox.sendKeys("abracadabra alkazim");
        //feedback from Jenny
        WebElement feedbackBox=driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        feedbackBox.sendKeys("The website is too slow");
        //coursetopic
        WebElement courseTopic=driver.findElement(By.cssSelector("input[name*='contentInput']"));
        courseTopic.sendKeys("selenium");
        //introtoADVANCECSS
        WebElement intro=driver.findElement((By.cssSelector("input[name^='IntroInput556']")));
        intro.sendKeys("easy");

        WebElement conclusion=driver.findElement(By.cssSelector("input[name$='Input']"));
        conclusion.sendKeys("welldone");

WebElement fFromRaj=driver.findElement(By.cssSelector("input[class$='feedbackBox2']"));
fFromRaj.sendKeys("all is good");
WebElement email=driver.findElement(By.cssSelector("input[name^='em']"));
email.sendKeys("fffrajjj@gmail.com");
    }
}
