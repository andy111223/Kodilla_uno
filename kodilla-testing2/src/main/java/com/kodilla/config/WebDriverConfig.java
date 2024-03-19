package com.kodilla.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverConfig {

    public static final String CHROME = "CHROME_DRIVER";
    public static final String BRAVE = "BRAVE_DRIVER";
    public static WebDriver getDriver(final String driverType) {

        System.setProperty("webdriver.chrome.driver", "/home/andrzej/Development/Projects/kodilla-course/Kodilla_uno/chromedriver-linux64/chromedriver");

        if (driverType.equals(CHROME)) {
            return new ChromeDriver();
        } else if (driverType.equals(BRAVE)){
            ChromeOptions options = new ChromeOptions();
            options.setBinary("/usr/bin/brave-browser");
            return new ChromeDriver(options);
        } else {
            return null;
        }
    }
}
