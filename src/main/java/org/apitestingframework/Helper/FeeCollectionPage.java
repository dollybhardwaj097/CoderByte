package org.apitestingframework.Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FeeCollectionPage {
    private WebDriver driver;
    private By globalStudentSearchBox = By.id("global-search");
    private By searchButton = By.id("search-btn");
    private By payableSection = By.xpath("//div[text()='Payable']/following-sibling::div[@class='section-content']");
    private By paymentModeDropdown = By.id("payment-mode");
    private By payButton = By.id("pay-btn");

    public FeeCollectionPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchStudent(String studentID) {
        driver.findElement(globalStudentSearchBox).sendKeys(studentID);
        driver.findElement(searchButton).click();
    }

    public void collectFee(String paymentMode) {
        // Assuming there is a pending invoice under Payable section
        driver.findElement(payableSection).findElement(By.xpath(".//button[text()='Pay']")).click();
        driver.findElement(paymentModeDropdown).sendKeys(paymentMode);
        driver.findElement(payButton).click();
    }
}
