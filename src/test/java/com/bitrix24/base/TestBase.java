package com.bitrix24.base;

import com.bitrix24.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import javax.swing.*;

public class TestBase {
    protected WebDriver driver;
    protected Actions action;
    @BeforeMethod
    public void setDriver(){
        driver= Driver.getDriver();
        action = new Actions( driver );
    }
    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
}
