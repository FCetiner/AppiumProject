package firstAppiumTests;



import java.net.URL;
import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
        import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserStackAndroid {

    public static String userName = "ferhatetiner_hdXg93";
    public static String accessKey = "RGNecZmzYsSBgdhZVMW6";

    public static void main(String args[]) throws MalformedURLException, InterruptedException {

        //   curl -u "ferhatetiner_hdXg93:RGNecZmzYsSBgdhZVMW6" -X POST "https://api-cloud.browserstack.com/app-automate/upload"  -F "file=@C:\Users\Ferhat\IdeaProjects\appiumAutomation\src\test\java\APP\etsy.apk"

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("device", "Samsung Galaxy S8 Plus");
        caps.setCapability("os_version", "7.0");
        caps.setCapability("project", "My First Project");
        caps.setCapability("build", "First Test");
        caps.setCapability("name", "Browserstack");
        caps.setCapability("app", "bs://b8542571043cfbd2b994f671195c6cc0f53a6ca5");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);




        driver.quit();
    }
}
