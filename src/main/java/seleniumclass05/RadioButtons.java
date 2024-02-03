package seleniumclass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //go to syntaxprojects.com
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        //click on the radio button male
//        check if it is selected or not and print the status of selection the console
//        find the checkbox
        WebElement radioBtnMale = driver.findElement(By.xpath("//input[@value='Male' and @name='optradio' ]"));
//        click on it
        radioBtnMale.click();
        //   verify if it is selected
        if(radioBtnMale.isSelected()){
            System.out.println("male radio button has been clicked");
        }
        else {
            System.out.println("male radio button has not been clicked");
        }
        //  select the age
        List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@name='ageGroup']"));
        for(WebElement radio:radioBtns){
            String option = radio.getAttribute("value");//first iteration gets us 0-5=false
            if(option.equals("5 - 15")){                      //second iteration gets us 5-15=true
                radio.click();
                break;//breaks the loop, no need to traverse more
            }

        }
    }



    }

