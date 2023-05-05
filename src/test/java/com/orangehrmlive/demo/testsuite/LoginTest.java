package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Test
    public void verifyUserShouldLoginSuccessFully() {
//        Enter username
        loginPage.setUserName("Admin");
//        Enter password
        loginPage.setPassword("admin123");
//        Click on Login Button
        loginPage.setLogIn();
//        Verify "Dashboard" Message
        Assert.assertEquals(dashboardPage.getDashBoardText(), "Dashboard", "Error");
    }

    @Test   //2
    public void VerifyThatTheLogoDisplayOnLoginPage() {
//        Launch the application

//        Verify Logo is Displayed
        Assert.assertTrue(loginPage.logoIsPresent());
    }

    @Test  //3
    public void VerifyUserShouldLogOutSuccessFully() {
//        Login To The application
        verifyUserShouldLoginSuccessFully();
//        Click on User Profile logo
        dashboardPage.setUserlogo();
//        Mouse hover on "Logout" and click
        dashboardPage.setUserLogout();
//        Verify the text "Login Panel" is displayed
        Assert.assertEquals(loginPage.setLogInPanelText(), "Login", "error");
    }

}
