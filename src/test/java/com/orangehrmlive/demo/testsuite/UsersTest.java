package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsersTest extends BaseTest {
    LoginTest loginTest = new LoginTest();
    HomePage homePage = new HomePage();
    ViewSystemUsersPage viewSystemUsersPage = new ViewSystemUsersPage();
    AddUserPage addUserPage = new AddUserPage();


    @Test   //1
    public void adminShouldAddUserSuccessFully() throws InterruptedException {
//        Login to Application
        loginTest.verifyUserShouldLoginSuccessFully();
//        click On "Admin" Tab
        homePage.setAdmin();
//        Verify "System Users" Text
        Assert.assertEquals(viewSystemUsersPage.getSystemUserText(), "System Users", "Error");
//        click On "Add" button
        addUserPage.clickOnaddButton();

//        Verify "Add User" Text
        Assert.assertEquals(viewSystemUsersPage.getAddUser(), "Add User");
//        Select User Role "Admin"
        addUserPage.setUserRole();
        Thread.sleep(1000);
//        enter Employee Name "Ananya Dash"
        addUserPage.setEmployeeName("Odis");

        addUserPage.selectStatusFromDropDown();
        Thread.sleep(1000);
//        enter Username
        addUserPage.setUserName("Odis .Adalwin");
        Thread.sleep(500);
//        enter psaaword
        addUserPage.setPassword("Admin@123");
//        enter Confirm Password
        addUserPage.setConfrimPassword("Admin@123");
//        click On "Save" Button
        addUserPage.setSave();
        Thread.sleep(1500);
//        verify message "Successfully Saved"
        Assert.assertEquals(addUserPage.getSuccessfullySavedText(), "Successfully Saved");

    }

    @Test //2
    public void searchTheUserCreatedAndVerifyIt() throws InterruptedException {
//        Login to Application
        loginTest.verifyUserShouldLoginSuccessFully();
//        click On "Admin" Tab
        homePage.setAdmin();
//        Verify "System Users" Text
        Assert.assertEquals(viewSystemUsersPage.getSystemUserText(), "System Users", "Error");
//        Enter Username
        viewSystemUsersPage.setUserName("Odis .Adalwin");
//        Click on "Search" Button
        viewSystemUsersPage.setSearch();
        Thread.sleep(1000);
//        Verify the User should be in Result list.
        Assert.assertEquals(viewSystemUsersPage.getUsernamePresentText(), "Odis .Adalwin", "error");

    }

    @Test  //3
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() throws InterruptedException {
//        Login to Application
        loginTest.verifyUserShouldLoginSuccessFully();
//        click On "Admin" Tab
        homePage.setAdmin();
//        Verify "System Users" Text
        Assert.assertEquals(viewSystemUsersPage.getSystemUserText(), "System Users", "Error");
//        Enter Username
        viewSystemUsersPage.setUserName("Odis .Adalwin");
//        Select User Role
//        viewSystemUsersPage.selectAdminOptionFromDropDown();
////        Select Satatus
//        viewSystemUsersPage.setStatusDropDown();
//        Click on "Search" Button
        viewSystemUsersPage.setSearch();
        Thread.sleep(1000);
//        Verify the User should be in Result list.
        Assert.assertEquals(viewSystemUsersPage.getUsernamePresentText(), "Odis .Adalwin", "error");
//        Click on Check box
        viewSystemUsersPage.clickOnCheckBox();
//        Click on Delete Button
        viewSystemUsersPage.clickDeleteButton();
//        Popup will display Click on Ok Button on Popup
        viewSystemUsersPage.clickOnPop();
        Thread.sleep(500);
//        verify message "Successfully Deleted
        Assert.assertEquals(viewSystemUsersPage.getSuccessfulDeleteText(), "Successfully Deleted");
    }

    @Test //4.

    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() {
//        Login to Application
        loginTest.verifyUserShouldLoginSuccessFully();
//        click On "Admin" Tab
        homePage.setAdmin();
//        Enter Username
        viewSystemUsersPage.setUserName("Odis .Adalwin");
//        Select User Role
        viewSystemUsersPage.selectAdminOptionFromDropDown();
//      Select Satatus
        viewSystemUsersPage.setStatusDropDown();
//        Click on "Search" Button
        viewSystemUsersPage.setSearch();
//       verify message "No Records Found"
        Assert.assertEquals(addUserPage.getNoRecordFoundText(), "No Records Found");

    }
}
