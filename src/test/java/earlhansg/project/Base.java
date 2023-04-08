package earlhansg.project;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import earlhansg.project.base.BasePage;

public class Base extends BasePage{

    @Test
    public void configuration() throws MalformedURLException {
        configureAppium();
    }
    
}
