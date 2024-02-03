package seleniumclass10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BirthDayHW {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //go to hrm.com
        driver.get(" http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //log in to Admin account
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']/b")).click();
        WebElement calender=driver.findElement(By.xpath(("//img[@class='ui-datepicker-trigger']")));
        calender.click();
        //find the current date
        WebElement currentMonth= driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select BirthMonth=new Select(currentMonth);
        BirthMonth.selectByVisibleText("Nov");

        WebElement currentYear=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select BirthYear=new Select(currentYear);
        BirthYear.selectByVisibleText("1986");

        List<WebElement>BirthDay=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for(WebElement day:BirthDay){
            if(day.getText().equals("12")){
                day.click();
            }
        }


        }





}



