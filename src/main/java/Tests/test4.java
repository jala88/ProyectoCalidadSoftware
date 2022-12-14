package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {
    public static void main(String[] args) throws InterruptedException {
        //String url = "https://www.6pm.com/";
        System.setProperty("webdriver.chrome.driver", "D:\\Installation Project\\Project\\ProyectoCalidadSoftware\\src\\main\\resources\\Drivers\\chromeDriver.exe");


        //Initialize browser
        WebDriver driver = new ChromeDriver();



        //Open 6pm
        driver.get("https://www.6pm.com/");

        WebElement liveChat = driver.findElement(By.linkText("Live Chat"));


        //Maximize browser
        driver.manage().window().maximize();
        Thread.sleep(1000);



        driver.get("https://www.6pm.com/tng/chat.zml");


        Thread.sleep(1000);
        driver.manage().window().maximize();

        WebElement login = driver.findElement(By.linkText("log in"));

        login.click();
        Thread.sleep(1000);
        //Credentials
        String userEmail= "christian19scorp@hotmail.com";
        String userPassword="Teradyne2022!";

        //Locators by  Id
        WebElement userMail = driver.findElement(By.id("ap_email"));
        WebElement password = driver.findElement(By.id("ap_password"));
        WebElement loginBtn = driver.findElement(By.id("signInSubmit"));


        //Login
        userMail.sendKeys(userEmail);
        password.sendKeys(userPassword);
        loginBtn.click();

        Thread.sleep(2000);

        String user= "Chris";
        //Locators for chat
        WebElement firstName = driver.findElement(By.tagName("input"));
        WebElement mailAddress = driver.findElement(By.id("emailInput"));
        WebElement chatBtn = driver.findElement(By.linkText("Start Chatting"));

        firstName.sendKeys(user);
        mailAddress.sendKeys(userEmail);
        chatBtn.click();

        Thread.sleep(4000);



        driver.quit();

    }
}
