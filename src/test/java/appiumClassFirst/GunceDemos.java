package appiumClassFirst;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class GunceDemos {

    @Test
    public void touch() throws InterruptedException, MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "7.0");
        desiredCapabilities.setCapability("deviceName", "Pixel_2");
        desiredCapabilities.setCapability("AutomationName", "UiAutomator2");
        desiredCapabilities.setCapability("app", "C:\\Users\\Ferhat\\IdeaProjects\\appiumAutomation\\src\\test\\java\\APP\\Günce_base.apk");


        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http:127.0.0.1:4723/wd/hub"), desiredCapabilities);




    }


    }
