package seleniumclass08;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumclass04.WebElementCommands;

import java.time.Duration;
import java.util.List;

public class DynamicTableHW {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //go to hrms
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //set the Implicit Wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //login
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
         // click on PIM
        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        List<WebElement>ids=driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        //for (int i = 0; i < ids.size(); i++) {
        // String idNumbers=ids.get(i).getText();
       //  if(idNumbers.equals("95848A")){
        // System.out.println(i+1);
        // WebElement checkBox=driver.findElement(By.xpath("//table/tbody/tr["+(i+1)+"]/td[1]"));
        // checkBox.click();

         ids.forEach(x -> {
             String idValue = x.getText(); // Assuming this gets the unique identifier for each row
             if (idValue.equals("95848A")) {
                 WebElement checkBox = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_95848']"));
                 checkBox.click();
             }
         });


    }}















