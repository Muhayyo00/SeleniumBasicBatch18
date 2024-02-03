package seleniumclass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //go to syntax projects.com
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        //find the dropdown
        WebElement dd=driver.findElement(By.xpath("//select[@id='select-demo']"));
        //use select class
        Select sel=new Select(dd);
        sel.selectByIndex(2);
        Thread.sleep(2000);
        sel.selectByValue("Sunday");
        Thread.sleep(2000);
        sel.selectByVisibleText("Saturday");
        //multiselect dropdown
       WebElement dropDown=driver.findElement(By.xpath("//select[@id='multi-select']"));
        //select class
        Select sel1=new Select(dropDown);
        //whether the dropdown is multi select or not
        System.out.println("The dropdown is multiselect "+sel1.isMultiple());
        sel1.selectByValue("New York");
        sel1.selectByVisibleText("Florida");
        Thread.sleep(2000);
        sel1.deselectByValue("New York");


    }
}
