package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AdminPage extends Utility {
    By adminTab = By.xpath("//span[normalize-space()='Admin']");
    By systemUsersText = By.xpath("//h5[normalize-space()='System Users']");
    By addButton = By.xpath("//button[normalize-space()='Add']");
    By addUserText = By.xpath("//h6[normalize-space()='Add User']");
    By userRoleField = By.xpath("(//div[contains(text(),'-- Select --')])[1]");
    By userRoleAdmin = By.xpath("//span[contains(text(),'Admin')]");
    By employeeName = By.xpath("//input[@placeholder='Type for hints...']");
    By userName = By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");
    By statusField = By.xpath("//div[@class='oxd-select-text oxd-select-text--focus']");
    By enabledStatus = By.xpath("//div[@class='oxd-select-text-input'][normalize-space()='Enabled']");
   By passwordField = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']");
    By confirmPasswordField = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']");
    By saveButton = By.xpath("//button[normalize-space()='Save']");
    public void clickOnAdminTab(){
        mouseHoverOnTheElementAndClick(adminTab);
    }
    public String verifySystemUsersText(){
        return getTextFromElement(systemUsersText);
    }

    public void clickOnAddButton(){
        clickOnElement(addButton);
    }
    public String verifyAddUserText(){
        return getTextFromElement(addUserText);
    }
    public void selectUserRole() {
        clickOnElement(userRoleField);
        mouseHoverOnTheElementAndClick(userRoleAdmin);
    }
    public void enterUserName(String name){
        sendTextToElement(userName, name);
    }
    public void selectStatus() {
        clickOnElement(statusField);
        mouseHoverOnTheElementAndClick(enabledStatus);
    }
    public void enterEmployeeName(String name){
        sendTextToElement(employeeName, name);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }
    public void enterConfirmPassword(String confirmPassword){
        sendTextToElement(confirmPasswordField, confirmPassword);
    }
    public void clickOnSaveButton(){
        clickOnElement(saveButton);
    }
    public void switchToPopUp(){
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
    }
}
