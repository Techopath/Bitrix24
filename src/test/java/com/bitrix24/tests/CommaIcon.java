package com.bitrix24.tests;

import com.bitrix24.base.TestBase;
import com.bitrix24.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.security.Key;

public class CommaIcon extends TestBase {
    @Test
    public void test1(){
        driver.get(ConfigurationReader.getProperties("url"));
        driver.findElement(By.name("USER_LOGIN")).sendKeys(ConfigurationReader.getProperties("username"));
        driver.findElement(By.name("USER_PASSWORD")).sendKeys(ConfigurationReader.getProperties("password"));
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        driver.manage().window().maximize();
        driver.findElement(By.className("feed-add-post-micro")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[title='Quote text'] i")));
        driver.findElement(By.cssSelector("span[title='Quote text'] i")).click();
        WebElement frame =driver.findElement(By.cssSelector("iframe.bx-editor-iframe"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("//blockquote[@class='bxhtmled-quote']/br")).sendKeys("Hello");
        driver.switchTo().defaultContent();
        driver.findElement(By.id("blog-submit-button-save")).click();

    }
}
