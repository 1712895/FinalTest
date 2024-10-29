package org.example.Drivers;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.function.Function;

public class DriverUntils {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver d) {
        driver = d;
    }

    public static void init(String type) {
        switch (type) {
            case "chrome":
                setDriver(new ChromeDriver());
                break;

            case "firefox":
                setDriver(new FirefoxDriver());
                break;


        }
    }

    public static WebElement findElement(By by) {
        return getDriver().findElement(by);
    }

    public static void maximum() {
        getDriver().manage().window().maximize();
    }

    public static void url(String url) {
        getDriver().get(url);
    }

    public static void quit() {
        if (getDriver() != null) {
            getDriver().quit();
        }
    }

    public static void screenshot() {
        String destination = System.getProperty("user.dir") + File.separator + "target" + new Date().getTime() + "screenshot.png";
        File scrFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File(destination));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(scrFile);
    }

    public static void waitUntil(Function isTrue) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        wait.until(isTrue);
    }
}
