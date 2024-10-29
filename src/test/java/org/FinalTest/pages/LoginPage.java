package org.FinalTest.pages;

import org.example.Drivers.DriverUntils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginPage {

    By txtUserName = By.xpath("//input[@name='username']");
    By txtPassword = By.xpath("//input[@name='password']");
    By btnSignIn = By.xpath("//button[@type='submit']");


    public void login(String userName, String password) {
        DriverUntils.waitUntil(ExpectedConditions.visibilityOfElementLocated(txtUserName));
        DriverUntils.findElement(txtUserName).sendKeys(userName);
        //driver.findElement(txtPassword).clear();
        DriverUntils.waitUntil(ExpectedConditions.visibilityOfElementLocated(txtPassword));
        DriverUntils.findElement(txtPassword).sendKeys(password);
        DriverUntils.findElement(btnSignIn).click();


    }
}
