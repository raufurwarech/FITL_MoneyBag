package com.dev.admin.moneybag.testcases;

import com.dev.admin.moneybag.pages.loginpage.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {
    @Test
    public void doLoginWithUsernameShouldFail(){
        LoginPage loginPage = page.getInstance(LoginPage.class);
        loginPage = loginPage
                .fillUserName("admin")
                .clickSignInLinkButton();

        Assert.assertTrue(loginPage.hasError());
    }

    @Test
    public void doLoginWithPasswordShouldFail(){
        LoginPage loginPage = page.getInstance(LoginPage.class);
        loginPage = loginPage
                .fillUserName("admin")
                .clickSignInLinkButton();

        Assert.assertTrue(loginPage.hasError());
    }

    @Test
    public void doLoginShouldFail(){
        LoginPage loginPage = page.getInstance(LoginPage.class);
        loginPage = loginPage
                .fillUserName("admin")
                .clickSignInLinkButton();

        Assert.assertTrue(loginPage.hasError());
    }

}
