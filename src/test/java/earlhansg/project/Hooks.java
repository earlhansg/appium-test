package earlhansg.project;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import earlhansg.project.base.BasePage;

public class Hooks extends BasePage{

    @BeforeClass
    public void configuration() throws MalformedURLException {
        configureAppium();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
        service.stop();
    }
    
}
