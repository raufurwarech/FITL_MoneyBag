package com.dev.admin.moneybag.pages.loginpage;

import com.dev.admin.moneybag.pages.base.BasePage;
import com.dev.admin.moneybag.pages.homepage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage fillUserName(String username){
        getWebElement(By.cssSelector("[placeholder='Username']")).sendKeys(username);
        return this;
    }

    public LoginPage fillPassword(String password){
        getWebElement(By.cssSelector("[placeholder='Password']")).sendKeys(password);
        return this;
    }
    public HomePage clickSignInButton(){
        getWebElement(By.cssSelector("[type='submit']")).click();
        return getInstance(HomePage.class);
    }

    public LoginPage clickSignInLinkButton(){
        getWebElement(By.cssSelector("[type='submit']")).click();
        return getInstance(LoginPage.class);
    }

    public LoginPage clickForgetPassword(){
        getWebElement(By.cssSelector("[type='button']")).click();
        return this;
    }

    public boolean hasError(){
        return  getWebElements(By.className("error")).size() > 0;
    }

}
