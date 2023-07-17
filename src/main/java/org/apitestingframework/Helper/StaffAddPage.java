package org.apitestingframework.Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StaffAddPage {
    private WebDriver driver;
    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By emailField = By.id("email");
    private By phoneField = By.id("phone");
    private By saveButton = By.id("save-btn");

    public StaffAddPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addNewStaff(String firstName, String lastName, String email, String phone) {
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(phoneField).sendKeys(phone);
        driver.findElement(saveButton).click();
    }
}
