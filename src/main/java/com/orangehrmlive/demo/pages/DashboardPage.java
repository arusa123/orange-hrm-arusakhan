package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {
    By dashBoard = By.xpath("//h6[normalize-space()='Dashboard']");

    By userlogo = By.xpath("//img[@class='oxd-userdropdown-img']");
    By userLogout = By.xpath("(//a[@class='oxd-userdropdown-link'])[4]");

    //this method will click on logout
    public void setUserLogout() {
        mouseHoverToElementAndClick(userLogout);
    }

    //this method wil click on profile logo
    public void setUserlogo() {
        clickOnElement(userlogo);
    }

    //this method will get dashboard text
    public String getDashBoardText() {
        return getTextFromElement(dashBoard);
    }


}
