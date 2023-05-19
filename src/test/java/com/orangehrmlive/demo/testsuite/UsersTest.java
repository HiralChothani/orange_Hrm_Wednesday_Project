package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.AdminPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsersTest extends BaseTest {
    LoginTest loginTest = new LoginTest();
    AdminPage adminPage = new AdminPage();

    @Test
    public void adminShouldAddUserSuccessFully() throws InterruptedException {
        loginTest.verifyUserShouldLoginSuccessFully();
        adminPage.clickOnAdminTab();
        Assert.assertEquals(adminPage.verifySystemUsersText(),"System Users","Text not displayed");
        adminPage.clickOnAddButton();
        Assert.assertEquals(adminPage.verifyAddUserText(),"Add User", "Text not displayed");
        adminPage.selectUserRole();
        adminPage.enterEmployeeName("Linda Anderson");
        adminPage.enterUserName("abcdefg");
        adminPage.selectStatus();
        adminPage.enterPassword("Abcd123*");
        adminPage.enterConfirmPassword("Abcd123*");
        adminPage.clickOnSaveButton();
        adminPage.switchToPopUp();

    }

    @Test
    public void searchTheUserCreatedAndVerifyIt(){
        loginTest.verifyUserShouldLoginSuccessFully();
        adminPage.clickOnAdminTab();
        Assert.assertEquals(adminPage.verifySystemUsersText(),"System Users","Text not displayed");
        adminPage.enterUserName("Jahnavi");
        adminPage.selectUserRole();
        adminPage.selectStatus();


    }
}
