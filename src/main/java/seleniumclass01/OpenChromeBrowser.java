package seleniumclass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {
    public static void main(String[] args) throws InterruptedException {
        //instantiating the instance of chrome driver
        WebDriver driver=new ChromeDriver();
        //go to a url
        driver.get("https://www.google.com");
        //maximize the screen
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();//is another option for maximizing but rarely used
        //get the title
        String title = driver.getTitle();
        System.out.println("The title of the page is "+title);

        //get the url of the page
        String url = driver.getCurrentUrl();
        System.out.println("The url is "+url);
        //slow down code
        Thread.sleep(4000);
        //close the window
        driver.quit();//you can also say--->driver.close();
    }
}
