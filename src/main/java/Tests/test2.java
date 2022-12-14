package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class test2 {
    public static void main(String[] args){
        String url= "https://auth.6pm.com/ap/signin?openid.return_to=https%3A%2F%2Fwww.6pm.com%2Fzap%2FloginComplete&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=6pm_us_desktop&openid.oa2.response_type=code&openid.mode=checkid_setup&openid.ns.oa2=http%3A%2F%2Fwww.amazon.com%2Fap%2Fext%2Foauth%2F2&siteState=400718a4-8b7d-4d1f-b2cd-5fb2bc6f7f0e%3ADLbolOvvSWsdkJeiuIokmIhDMxmfpkqaeXY5lohvw9I%3D%3Anull&openid.oa2.scope=auth_code&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.oa2.client_id=iba%3Aamzn1.application-oa2-client.9c0ef4f0412841b99269dbbe09636ca8&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0";
        System.setProperty("webdriver.chrome.driver","D:\\Installation Project\\Project\\ProyectoCalidadSoftware\\src\\main\\resources\\Drivers\\chromeDriver.exe");

        //Initialize browser
        WebDriver driver= new ChromeDriver();

        //Open 6pm
        driver.get(url);

        //Maximize browser
        driver.manage().window().maximize();

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





        //List<WebElement> inputs =  driver.findElements(By.tagName("input"));
        //System.out.println("Cantidad de elementos: "+inputs.size());
        driver.quit();


    }
}
