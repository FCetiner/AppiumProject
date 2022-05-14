package appiumClassFirst;
//   curl -u "ferhatetiner_hdXg93:RGNecZmzYsSBgdhZVMW6" -X POST "https://api-cloud.browserstack.com/app-automate/upload"  -F "file=@C:\Users\Ferhat\IdeaProjects\appiumAutomation\src\test\java\APP\apidemos.apk"

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class LifeVsonBrowserStack {
    public static String userName = "ferhatetiner_hdXg93";
    public static String accessKey = "RGNecZmzYsSBgdhZVMW6";
    public static void main(String args[]) throws MalformedURLException, InterruptedException {




            //   curl -u "ferhatetiner_hdXg93:RGNecZmzYsSBgdhZVMW6" -X POST "https://api-cloud.browserstack.com/app-automate/upload"  -F "file=@C:\Users\Ferhat\IdeaProjects\appiumAutomation\src\test\java\APP\etsy.apk"



        // Use Java Client v6.0.0 or above
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("platformVersion", "12.0");
        capabilities.setCapability("deviceName", "Samsung Galaxy S22");
        capabilities.setCapability("app", "bs://797c7ccfd6d3f1f59d2427801d27e0ebb6f0bfed");


        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), capabilities);



            driver.quit();
        }
}
