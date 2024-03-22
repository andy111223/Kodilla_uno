package com.kodilla.driverSetUpCheck;

import com.kodilla.config.WebDriverConfig;
import org.openqa.selenium.WebDriver;

public class DriverSetUpCheck {
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.google.com");
        System.out.println("Title: " + driver.getTitle());
        driver.quit();
    }

}
