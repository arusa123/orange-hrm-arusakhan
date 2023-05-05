package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By search = By.xpath("//input[@placeholder='Search']");
    By admin = By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]");

    By pIM = By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]");
    By leave = By.xpath("//span[normalize-space()='Leave']");

    //this method will click on the search
    public void setSearch() {
        clickOnElement(search);
    }

    //this method will click on admin
    public void setAdmin() {
        clickOnElement(admin);
    }

    //this method will click on the PIM
    public void setpIM() {
        clickOnElement(pIM);
    }

    //this method will click on leave
    public void setLeave() {
        clickOnElement(leave);
    }
}
