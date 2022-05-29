package firstAppiumTests;
//   curl -u "ferhatetiner_hdXg93:RGNecZmzYsSBgdhZVMW6" -X POST "https://api-cloud.browserstack.com/app-automate/upload"  -F "file=@C:\Users\Ferhat\IdeaProjects\appiumAutomation\src\test\java\APP\apidemos.apk"

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackApiDemos {
    public static String userName = "developerteam_r8gNdl";
    public static String accessKey = "18cc9MVxuwjSZkBTfNsb";
    public static void main(String args[]) throws MalformedURLException, InterruptedException {




            //   curl -u "ferhatetiner_hdXg93:RGNecZmzYsSBgdhZVMW6" -X POST "https://api-cloud.browserstack.com/app-automate/upload"  -F "file=@C:\Users\Ferhat\IdeaProjects\appiumAutomation\src\test\java\APP\etsy.apk"

            DesiredCapabilities caps = new DesiredCapabilities();

            caps.setCapability("deviceName", "Samsung Galaxy S8 Plus");
            caps.setCapability("platformName", "android");
            caps.setCapability("os_version", "7.0");
            caps.setCapability("project", "Bulut");
            caps.setCapability("build", "Galaxy8");
            caps.setCapability("name", "AppDemosTes");
            caps.setCapability("app", "bs://02be17af68a64a67403131e01a9381a9e25952d5");

            AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);

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
