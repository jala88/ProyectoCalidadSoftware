package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
       //String url = "https://www.6pm.com/";
        System.setProperty("webdriver.chrome.driver", "D:\\Installation Project\\Project\\ProyectoCalidadSoftware\\src\\main\\resources\\Drivers\\chromeDriver.exe");


        //Initialize browser
        WebDriver driver = new ChromeDriver();



        //Open 6pm
        driver.get("https://www.6pm.com/");

        WebElement socialMedia = driver.findElement(By.linkText("Instagram"));

        //Maximize browser
        driver.manage().window().maximize();
        Thread.sleep(4000);

        socialMedia.click();

        Thread.sleep(4000);

        driver.quit();

    }
}
