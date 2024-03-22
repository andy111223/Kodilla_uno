package com.kodilla.testing2.facebook;

import com.kodilla.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FacebookTestingApp {


    public static final String XPATH_ACCEPT_COOKIES = "//button[text()='Zezwól na wszystkie pliki cookie']";
    public static final String XPATH_CREATE_NEW_ACCOUNT = "//a[contains(text(),'Utwórz nowe konto')]";
    public static final String XPATH_SELECT_DAY = "//select[@id='day']";
    public static final String XPATH_BIRTH_MONTH = "//select[@id='month']";
    public static final String XPATH_BIRTH_YEAR = "//select[@id='year']";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://www.facebook.com/");

        WebElement acceptCookiesButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XPATH_ACCEPT_COOKIES)));
        acceptCookiesButton.click();

        WebElement createAccountButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XPATH_CREATE_NEW_ACCOUNT)));
        createAccountButton.click();

        WebElement dayDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XPATH_SELECT_DAY)));
        Select daySelect = new Select(dayDropdown);
        daySelect.selectByIndex(0);

        WebElement monthDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XPATH_BIRTH_MONTH)));
        Select monthSelect = new Select(monthDropdown);
        monthSelect.selectByIndex(0);

        WebElement yearDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XPATH_BIRTH_YEAR)));
        Select yearSelect = new Select(yearDropdown);
        yearSelect.selectByValue("1990");
    }
}
