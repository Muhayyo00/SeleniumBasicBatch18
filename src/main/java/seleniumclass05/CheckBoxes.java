package seleniumclass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //go to syntax projects.com
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        //        click on the checkbox
        WebElement cb1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        cb1.click();

        //        select all options from the checkboxes
        List<WebElement> options= driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for(WebElement option:options) {
            option.click();
        }//clicks on all the checkboxes

          //Select option3 from the checkboxes
          List<WebElement>option = driver.findElements(By.xpath("//input[@class='cb1-element']"));
          for(WebElement op: options) {
              String optionVal = op.getAttribute("value");
              if (optionVal.equals("Option-3")) {
                  op.click();//selects only checkbox3
                  break;
              }
          }}}


