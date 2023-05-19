package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    @Test
    public void verifyUserShouldLoginSuccessFully(){
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        Assert.assertEquals(loginPage.getDashboardMessage(),"Dashboard", "Message not displayed");

    }
    @Test
    public void verifyThatTheLogoDisplayOnLoginPage(){
        WebElement i = driver.findElement
                (By.xpath("//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']"));
        // Javascript executor to check image
        Boolean p = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != undefined " + "&& arguments[0].naturalWidth > 0", i);

        //verify if status is true
        if (p) {
            System.out.println("Logo present");
        } else {
            System.out.println("Logo not present");
        }
    }

    @Test
    public void VerifyUserShouldLogOutSuccessFully(){
        verifyUserShouldLoginSuccessFully();
        loginPage.clickOnUserProfileLogo();
        loginPage.mouseHoverOverLogoutAndClick();
        Assert.assertEquals(loginPage.verifyLoginPanelIsDisplayed(),"Login", "Text not displayed");
    }
}
