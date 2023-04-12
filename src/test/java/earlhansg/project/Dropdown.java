package earlhansg.project;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Dropdown extends Hooks {
    @Test
    public void dropDownMenuTest() {

        // Scroll and select Canada option from dropDown
        driver.findElement(By.id("android:id/text1")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + "Canada" + "\"));"));
        driver.findElement(By.xpath("//android.widget.TextView[@text='Canada']")).click();

        // Type name in a text field
        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Earl Hans");
        driver.hideKeyboard();

        // Select radio option
        driver.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
    }
}
