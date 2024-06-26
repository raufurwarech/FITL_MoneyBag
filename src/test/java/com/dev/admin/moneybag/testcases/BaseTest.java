package com.dev.admin.moneybag.testcases;

import com.dev.admin.moneybag.pages.base.BasePage;
import com.dev.admin.moneybag.pages.base.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    WebDriver driver;
    Page page;

    @BeforeMethod
    public void setupBrowser(){
        driver =new FirefoxDriver();
        driver.get("https://dev-admin.moneybag.com.bd/");
        driver.manage().window().maximize();

        page =new BasePage(driver);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

