package earlhansg.project.base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BasePage {
    
    public AndroidDriver driver;
    public AppiumDriverLocalService service;

    public void configureAppium() throws MalformedURLException {

        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        builder = new AppiumServiceBuilder();
        builder.withAppiumJS(new File("C:\\Users\\Admin\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"));
        builder.usingDriverExecutable(new File ("C:\\Program Files\\nodejs\\node.exe"));
        builder.withIPAddress("127.0.0.1");
        builder.usingPort(4723);

        try {
            service = AppiumDriverLocalService.buildService(builder);
            service.start();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Demo 1");
        options.setApp(System.getProperty("user.dir")+"\\src\\main\\java\\earlhansg\\project\\apk\\ApiDemos-debug.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.quit();
    }
}
