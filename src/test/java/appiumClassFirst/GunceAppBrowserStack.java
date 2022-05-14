package appiumClassFirst;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class GunceAppBrowserStack {
    public static String userName = "ferhatetiner_hdXg93";
    public static String accessKey = "RGNecZmzYsSBgdhZVMW6";
    @Test
    public void touch() throws InterruptedException, MalformedURLException {
        //   curl -u "ferhatetiner_hdXg93:RGNecZmzYsSBgdhZVMW6" -X POST "https://api-cloud.browserstack.com/app-automate/upload"  -F "file=@C:\Users\Ferhat\IdeaProjects\appiumAutomation\src\test\java\APP\etsy.apk"

        // Use Java Client v6.0.0 or above
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("platformVersion", "9.0");
        capabilities.setCapability("deviceName", "Google Pixel 3");
        capabilities.setCapability("app", "bs://3c30ab8f8548c1ba3e7fec2745660329390970c2");


        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), capabilities);

        WebElement preference = driver.findElementByAccessibilityId("Preference");
        preference.click();

        Thread.sleep(2000);
        WebElement preferenceDependencies = driver.findElementByAccessibilityId("3. Preference dependencies");
        preferenceDependencies.click();

        WebElement checkBox = driver.findElementById("android:id/checkbox");
        checkBox.click();

        Thread.sleep(2000);

        WebElement wifiSetting = driver.findElement(By.xpath("(//*[@class='android.widget.RelativeLayout'])[2]"));
        wifiSetting.click();

        WebElement inputBox = driver.findElementById("android:id/edit");

        inputBox.sendKeys("appiumTest");

        WebElement okButton = driver.findElementById("android:id/button1");

        Assert.assertEquals("appiumTest",inputBox.getText());

        okButton.click();



        driver.quit();

    }


    }
