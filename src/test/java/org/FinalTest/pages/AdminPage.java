package org.FinalTest.pages;

import org.example.Drivers.DriverUntils;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class AdminPage {

    By btnAddButton = By.xpath("//div[contains(@class,'orangehrm-header-container')]/button");
    By optionUserRole = By.xpath("(//div[@class=\"oxd-select-text oxd-select-text--active\"])[1]");
    By txtEmployeeName = By.xpath("(//input[@placeholder=\"Type for hints...\"])");
    By optionStatus = By.xpath("(//div[@class=\"oxd-select-text oxd-select-text--active\"])[2]");
    By txtUserName = By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]");
    By txtPassword = By.xpath("(//input[@class=\"oxd-input oxd-input--active\" and @type=\"password\"])[1]");
    By txtConfirmPassword = By.xpath("(//input[@class=\"oxd-input oxd-input--active\" and @type=\"password\"])[2]");
    By btnSave = By.xpath("//button[@type=\"submit\"]");

    public void clickAddButton() {
        DriverUntils.waitUntil(ExpectedConditions.visibilityOfElementLocated(btnAddButton));
        DriverUntils.findElement(btnAddButton).click();
    }
    public void addNewUser() {
        DriverUntils.waitUntil(ExpectedConditions.visibilityOfElementLocated(btnAddButton));
        DriverUntils.findElement(btnAddButton).click();
        DriverUntils.waitUntil(ExpectedConditions.visibilityOfElementLocated(optionUserRole));
        DriverUntils.findElement(optionUserRole).click();
        new Actions(DriverUntils.getDriver())
                .moveToElement(DriverUntils.findElement(optionUserRole),-50,50).click().perform();
        DriverUntils.findElement(optionStatus).click();
        new Actions(DriverUntils.getDriver())
                .moveByOffset(20, 20).click().perform();
        DriverUntils.findElement(txtUserName).sendKeys("UyenTran");
        DriverUntils.findElement(txtPassword).sendKeys("Password1");
        new Actions(DriverUntils.getDriver())
                .moveByOffset(20, 20).click().perform();
        DriverUntils.findElement(txtConfirmPassword).sendKeys("Password1");
        new Actions(DriverUntils.getDriver())
                .moveByOffset(20, 20).click().perform();
        DriverUntils.waitUntil(ExpectedConditions.visibilityOfElementLocated(txtEmployeeName));
        DriverUntils.findElement(txtEmployeeName).sendKeys("Ranga  Akunuri");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        DriverUntils.findElement(btnSave).click();





//        WebElement ele= DriverUntils.findElement(txtEmployeeName);
//        Point point = ele.getLocation();
//        int xcord = point.getX();
//        System.out.println("ValueX: " + xcord );
//        int ycord = point.getY();
//        System.out.println("ValueY: " + ycord);






        
    }
}
