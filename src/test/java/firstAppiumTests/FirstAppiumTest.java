package firstAppiumTests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstAppiumTest {

    @Test
    public void test1() throws InterruptedException, MalformedURLException {
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("platformVersion","7.0");
        desiredCapabilities.setCapability("deviceName","Pixel_2");
        desiredCapabilities.setCapability("AutomationName","UiAutomator2");
        desiredCapabilities.setCapability("app","C:\\Users\\Ferhat\\IdeaProjects\\appiumAutomation\\src\\test\\java\\APP\\Duolingo.apk");


        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http:127.0.0.1:4723/wd/hub"), desiredCapabilities);


        Thread.sleep(5);

    //ilk test
        Thread.sleep(5000);

        WebElement getStarterd = driver.findElementById("com.duolingo:id/introFlowNewUserButton");
        getStarterd.click();
        Thread.sleep(5000);
        WebElement getGerman = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.TextView");
        getGerman.click();
        Thread.sleep(5000);
        WebElement getOther = driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"other\"]/android.widget.TextView");
        getOther.click();
        Thread.sleep(4000);

        WebElement getReguler = driver.findElementById("com.duolingo:id/xpGoalOptionRegular");
        getReguler.click();
        Thread.sleep(4000);
        WebElement getCont = driver.findElementById("com.duolingo:id/xpGoalContinueButton");
        getCont.click();
        Thread.sleep(4000);
        WebElement getSome = driver.findElementById("com.duolingo:id/placementHeader");
        getSome.click();
        Thread.sleep(4000);
        WebElement getStartTest = driver.findElementById("com.duolingo:id/primaryButton");
        getStartTest.click();/////
    }
}
