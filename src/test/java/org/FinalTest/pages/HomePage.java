package org.FinalTest.pages;

import org.example.Drivers.DriverUntils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage {
    By txtUserProfileName = By.xpath("//p[contains(@class,'oxd-userdropdown-name')]");
    By btnAdmin = By.xpath("//li[1][contains(@class,'oxd-main-menu-item-wrapper')]");
    By PIMPage = By.xpath("//li[2][contains(@class,'oxd-main-menu-item-wrapper')]");


    public String getUserName() {
        DriverUntils.waitUntil(ExpectedConditions.visibilityOfElementLocated(txtUserProfileName));
        return DriverUntils.findElement(txtUserProfileName).getText();
    }

    public void goToAdminPage() {
        DriverUntils.waitUntil(ExpectedConditions.visibilityOfElementLocated(btnAdmin));
        DriverUntils.findElement(btnAdmin).click();
    }

    public void goToPIMPage() {
        DriverUntils.waitUntil(ExpectedConditions.visibilityOfElementLocated(PIMPage));
        DriverUntils.findElement(PIMPage).click();
    }

}
