package earlhansg.project;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Scroll extends Hooks{
    @Test
    public void scrollToElement() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        Thread.sleep(2000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + "WebView" + "\"));"));
    }
}
