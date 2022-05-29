package firstAppiumTests;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.HashMap;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class BrowserStackIOS {

    public static String userName = "ferhatetiner_hdXg93";
    public static String accessKey = "RGNecZmzYsSBgdhZVMW6";

    public static void main(String args[]) throws MalformedURLException, InterruptedException {
        // Use Java Client v6.0.0 or above
        DesiredCapabilities capabilities = new DesiredCapabilities();
        HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
        browserstackOptions.put("projectName", "iPhone 12");
        capabilities.setCapability("bstack:options", browserstackOptions);
        capabilities.setCapability("platformName", "ios");
        capabilities.setCapability("platformVersion", "14");
        capabilities.setCapability("deviceName", "iPhone 12");
        capabilities.setCapability("app", "bs://444bd0308813ae0dc236f8cd461c02d3afa7901d");


        IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), capabilities);

        IOSElement textButton = (IOSElement) new WebDriverWait(driver, 30).until(
                ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Button")));
        textButton.click();
        IOSElement textInput = (IOSElement) new WebDriverWait(driver, 30).until(
                ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Input")));
        textInput.sendKeys("Appium dersine hosgeldiniz");

        Thread.sleep(5000);

        IOSElement textOutput = (IOSElement) new WebDriverWait(driver, 30).until(
                ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Output")));

        if(textOutput != null && textOutput.getText().equals("hello@browserstack.com"))
            assert(true);
        else
            assert(false);

        // The driver.quit statement is required, otherwise the test continues to execute, leading to a timeout.
        driver.quit();
    }
}
