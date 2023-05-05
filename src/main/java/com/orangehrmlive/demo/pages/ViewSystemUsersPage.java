package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ViewSystemUsersPage extends Utility {
    By systemUsertext = By.xpath("//h5[normalize-space()='System Users']");

    By addUserText = By.xpath("//h6[normalize-space()='Add User']");
    By userName = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");

    By userRollDown = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]//div[2]/i");
    By employeeName = By.xpath("//input[@placeholder='Type for hints...']");

    By statusDropDown = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]");

    By search = By.xpath("//button[normalize-space()='Search']");
    By reset = By.xpath("//button[normalize-space()='Reset']");

    By admin = By.xpath("//span[contains(text(),'Admin')]");
    //span[contains(text(),'Admin')

    By enableOption = By.xpath("//span[normalize-space()='Enabled']");

    By delete = By.xpath("//button[normalize-space()='Delete Selected']");

    By usernameText = By.xpath("//div[@class='oxd-table-card']/div/div[2]/div");
    By checkbox = By.xpath("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[2]");

    By popUp = By.xpath("//button[normalize-space()='Yes, Delete']");

    By deleteMessage = By.xpath("//div[@class='oxd-toast-content oxd-toast-content--success']/p[2]");
    //this method will click on the pop
    public void clickOnPop(){
        clickOnElement(popUp);
    }

    //this method will click on the check bo
    public void clickOnCheckBox() {
        clickOnElement(checkbox);
    }

    //this method will get the username text
    public String getUsernamePresentText() {
        return getTextFromElement(usernameText);
    }

    //this method will delete the record
    public void clickDeleteButton() {
        clickOnElement(delete);
    }

    //this method will click on reset button
    public void setReset() {
        clickOnElement(reset);
    }

    //this method will click on search'
    public void setSearch() {
        clickOnElement(search);
    }

    //this method will select the status
    public void setStatusDropDown() {
        clickOnElement(statusDropDown);
        clickOnElement(enableOption);
    }

    //this method will send keys to employee field
    public void setEmployeeName(String name) {
        sendTextToElement(employeeName, name);
    }

    //this method will select the role from user roll down
    public void selectAdminOptionFromDropDown() {
        clickOnElement(userRollDown);
        clickOnElement(admin);

    }

    //this method will send the keys to username filed
    public void setUserName(String uName) {
        sendTextToElement(userName, uName);
    }


    //this method will click on add button
    public String getAddUser() {
        return getTextFromElement(addUserText);
    }


    //this method will get the system user text
    public String getSystemUserText() {
        return getTextFromElement(systemUsertext);
    }

    public String getSuccessfulDeleteText(){
        return getTextFromElement(deleteMessage);
    }
}
