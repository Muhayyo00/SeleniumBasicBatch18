package seleniumclass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/advanceXpath.php");
        WebElement fSibling1=driver.findElement(By.xpath("//input[@id='favourite-book']"));
        fSibling1.sendKeys("The Da Vinci Code");
        WebElement fSibling2=driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]"));
        fSibling2.sendKeys("The Alchemist");
        WebElement fSibling3=driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[2]"));
        fSibling3.sendKeys("The Zahir");
        WebElement pSibling1=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        pSibling1.sendKeys("The Zahir");
        WebElement pSibling2=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        pSibling2.sendKeys("The Alchemist");
        WebElement pSibling3=driver.findElement(By.xpath("//input[@id='least-favorite']"));
        pSibling3.sendKeys("The Da Vinci Code");
        WebElement pChildRelationship1=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        pChildRelationship1.sendKeys("Grandparent");
        WebElement pChildRelationship2=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        pChildRelationship2.sendKeys("Parent");
        WebElement pChildRelationship3=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        pChildRelationship3.sendKeys("Child");
    }
}
