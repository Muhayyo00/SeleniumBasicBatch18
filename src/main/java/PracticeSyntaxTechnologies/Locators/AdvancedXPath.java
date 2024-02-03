package PracticeSyntaxTechnologies.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXPath {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/advanceXpath.php");
        WebElement folSibling1=driver.findElement(By.xpath("//input[@id='favourite-book']"));
        folSibling1.sendKeys("The Da Vinci Code");
        WebElement folSibling2=driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]"));
        folSibling2.sendKeys("Alchemist");
        WebElement folSibling3=driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[2]"));
        folSibling3.sendKeys("Zahira");
        WebElement preSibling=driver.findElement(By.xpath("//input[@id='least-favorite']"));
        preSibling.sendKeys("The Da Vinci Code");
        WebElement preSibling1=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        preSibling1.sendKeys("Alchemist");
        WebElement preSibling2=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        preSibling2.sendKeys("Zahira");
        WebElement parentChild=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        parentChild.sendKeys("grandparent");
        WebElement parentChild1=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        parentChild1.sendKeys("parent");
        WebElement parentChild2=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        parentChild2.sendKeys("child");


    }
}
