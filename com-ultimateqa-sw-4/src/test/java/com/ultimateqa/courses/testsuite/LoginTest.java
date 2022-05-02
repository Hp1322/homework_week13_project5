package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.UserSignIn;
import com.ultimateqa.courses.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage = new HomePage();
    UserSignIn userSignIn = new UserSignIn();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        homePage.clickOnSignLink();
        Assert.assertEquals(userSignIn.getWelcomeText(), "Welcome Back!", "Not navigate to page");
    }

    @Test
    public void verifyTheErrorMessage() {
        HomePage homePage = new HomePage();
        userSignIn.sendEmail("kpp@gmail.com");
        userSignIn.sendEmail("123456");
        userSignIn.clickOnLoginButton();
        Assert.assertEquals(userSignIn.getInvalidMessage(), "Invalid email or password.", "Not navigate to page");
    }

}
