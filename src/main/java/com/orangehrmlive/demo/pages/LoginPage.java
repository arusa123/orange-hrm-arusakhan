package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
  public By userName = By.xpath("//input[@placeholder='Username']");
  public   By password = By.xpath("//input[@placeholder='Password']");

    By logIn = By.xpath("//button[normalize-space()='Login']");

    By hrLogo = By.xpath("//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']");

    By logInPanelText = By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']");

    //this method will verify if the logo is present or not
  public boolean logoIsPresent(){
    return driver.findElement(hrLogo).isDisplayed();
  }
    public String setLogInPanelText(){
        return getTextFromElement(logInPanelText);
    }
    //this method will get the log in text
    public void setLogIn(){
        clickOnElement(logIn);
    }
    //this method will send the username in the username field
    public void setUserName(String name) {
        sendTextToElement(userName, name);
    }

    //this method will send the password in the password filed
    public void setPassword(String pass) {
        sendTextToElement(password, pass);

    }


}
