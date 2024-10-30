package org.FinalTest.suite.UpdateUserInfo;

import org.FinalTest.pages.AdminPage;
import org.FinalTest.pages.HomePage;
import org.FinalTest.pages.LoginPage;
import org.example.Drivers.DriverUntils;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UpdateContectDetails {
    LoginPage loginPage;


    @BeforeMethod
    public void BeforeMethod() {
        ChromeOptions chromeOptions = new ChromeOptions();
        // chromeOptions.enableBiDi();

        DriverUntils.init("chrome");
        DriverUntils.maximum();

        DriverUntils.url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage = new LoginPage();
    }

    @AfterMethod
    public void AfterMethod() {
        DriverUntils.quit();
    }

    @Test
    public void LoginSuccess() {
        loginPage.login("Admin", "admin123");

        HomePage homePage = new HomePage();
        homePage.goToPIMPage();
    }
}