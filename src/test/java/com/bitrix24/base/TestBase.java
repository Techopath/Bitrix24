package com.bitrix24.base;

import com.bitrix24.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;
    @BeforeMethod
    public void setDriver(){
        driver= Driver.getDriver();
        wait= new WebDriverWait(driver,10);
    }
    @AfterMethod
    public void tearDown(){
    Driver.closeDriver();
    }
}
