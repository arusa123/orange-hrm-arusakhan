package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AddUserPage extends Utility {

    By addUser = By.xpath("//button[normalize-space()='Add']");
    By userRole = By.xpath("//div[@class='oxd-select-text--after'][1]/i");

    By employeeName = By.xpath("//input[@placeholder='Type for hints...']");
    By adminRole = By.xpath("//span[contains(text(),'Admin')]");
    By status = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]");
    By userName = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");

    By statusDisable = By.xpath("(//div[@class='oxd-select-option'])[3]/span");
    By password = By.xpath("(//input[@type='password'])[1]");

    By confrimPassword = By.xpath("(//input[@type='password'])[2]");

    By save = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");

    By cancel = By.xpath("//button[normalize-space()='Cancel']");

    By userSelection = By.xpath("//div[@class='oxd-autocomplete-option']/span");

    By successfullySavedText = By.xpath("//div[@class='oxd-toast-content oxd-toast-content--success']/p[2]");

    By noRecordFoundMessage = By.xpath("//span[normalize-space()='No Records Found']");


    // this method will send text to username
    public void setUserName(String uname) {
        sendTextToElement(userName, uname);
    }

    //this method will click on add button
    public void clickOnaddButton() {
        clickOnElement(addUser);
    }

    //this method will click on save button
    public void setSave() {
        clickOnElement(save);
    }

    //this method will click on cancel button
    public void setCancel() {
        clickOnElement(cancel);
    }

    //this method will send keys to confirm the password
    public void setConfrimPassword(String confirmpass) {
        sendTextToElement(confrimPassword, confirmpass);
    }


    //this method will send the keys to the password filed
    public void setPassword(String pass) {
        sendTextToElement(password, pass);
    }

    //this method will select the status
    public void selectStatusFromDropDown() {
        clickOnElement(status);
        clickOnElement(statusDisable);

    }

    //this method will send the name to employye name field
    public void setEmployeeName(String name) throws InterruptedException {
        sendTextToElement(employeeName, name);
        Thread.sleep(1000);
        clickOnElement(userSelection);
    }

    //this method will select the user role
    public void setUserRole() {
        clickOnElement(userRole);
        clickOnElement(adminRole);
    }

    public String getSuccessfullySavedText(){
        return  getTextFromElement(successfullySavedText);
    }

    public String getNoRecordFoundText(){
        return getTextFromElement(noRecordFoundMessage);
    }
}
