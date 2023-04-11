package earlhansg.project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class Swipe extends Hooks {
    @Test
    public void swipeTest() {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='1. Photos']")).click();

        WebElement firstImage = driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
        // before perform the swipe
        String firstTimeVale = firstImage.getAttribute("focusable");
        Assert.assertEquals("true", firstTimeVale);
        // perform swipe action
        swipeAction(firstImage, "left");
        // after perform the swipe
        String secondTimeVale = firstImage.getAttribute("focusable");
        Assert.assertEquals("false", secondTimeVale);
    }

    public void swipeAction(WebElement ele, String swipeDirection) {
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) ele).getId(),
                "direction", swipeDirection,
                "percent", 0.75
        ));	
    }
}
