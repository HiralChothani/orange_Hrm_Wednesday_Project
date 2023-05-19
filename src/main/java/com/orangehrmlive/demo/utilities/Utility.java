package com.orangehrmlive.demo.utilities;

import com.orangehrmlive.demo.browserfactory.ManageBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends ManageBrowser {
    public void sendTextToElement(By by, String text){
        driver.findElement(by).sendKeys(text);
    }
    public void clickOnElement(By by){
        driver.findElement(by).click();
    }

    public String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }

    public void mouseHoverOnTheElementAndClick(By by){
        WebElement element = driver.findElement(by);
        Actions action = new Actions(driver);
        action.moveToElement(element).click().build().perform();
    }
    public void selectByIndexFromDropDown(By by, int index){
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByIndex(index);
    }

}
