package com.bitrix24.base;

import com.bitrix24.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    protected WebDriver driver;
    @BeforeMethod
    public void setDriver(){
        driver= Driver.getDriver();
    }
    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
}
