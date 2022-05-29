package apkTests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TrendyolTest {
    @Test
    public void mi8Lite() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "MI_8_Lite");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, "63e9a041");
        desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\Ferhat\\IdeaProjects\\appiumAutomation\\src\\test\\java\\APP\\Duolingo.apk");
        desiredCapabilities.setCapability("noReset", "true");
        //? noReset, true olarak ayarlanırsa, bu oturum başlamadan önce uygulama verileri SİLİNMEZ.
        //? fullReset true olarak ayarlanırsa uygulama kaldırılır ve tüm veriler temizlenir.
       // desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.gunceproapp.GunceCloud");

        // desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "crc645e33510600e34ad5.MainActivity");

        // ! Yukarıdaki path i kendinize göre ayarlayınız.


        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http:127.0.0.1:4723/wd/hub"), desiredCapabilities);
    }
}
