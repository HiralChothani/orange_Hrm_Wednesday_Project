package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userNameField = By.xpath("//input[@placeholder='Username']");
    By passwordField = By.xpath("//input[@placeholder='Password']");
    By loginButton = By.xpath("//button[normalize-space()='Login']");
    By dashBoardMessage = By.xpath("//header/div[1]/div[1]/span[1]/h6[1]");
    By HRforAllLogo = By.xpath("//div[@class='orangehrm-login-slot-wrapper']");
    By logInPanelText = By.xpath("//h5[normalize-space()='Login']");
    By userProfileLogo = By.xpath("//p[@class='oxd-userdropdown-name']");
    By logOut = By.xpath("(//a[normalize-space()='Logout'])[1]");

    public void enterUserName(String text) {
        sendTextToElement(userNameField, text);
    }
    public void enterPassword(String text) {
        sendTextToElement(passwordField, text);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getDashboardMessage(){
       return getTextFromElement(dashBoardMessage);
    }
    public String verifyLogo(){
       return getTextFromElement(HRforAllLogo);
    }
    public void clickOnUserProfileLogo(){
        clickOnElement(userProfileLogo);
    }
    public void mouseHoverOverLogoutAndClick(){
        mouseHoverOnTheElementAndClick(logOut);
    }
    public String verifyLoginPanelIsDisplayed(){
        return getTextFromElement(logInPanelText);
    }
}
