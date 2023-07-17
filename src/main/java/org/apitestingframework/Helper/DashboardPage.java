package org.apitestingframework.Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;
    private By staffProfileManagementMenu = By.xpath("//span[text()='Staff Profile Management']");
    private By staffAddMenuItem = By.xpath("//span[text()='Staff Add']");
    private By feeConfigurationMenu = By.xpath("//span[text()='Fee Configuration']");
    private By feeCollectionMenuItem = By.xpath("//span[text()='Fee Collection']");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public StaffAddPage navigateToStaffAdd() {
        driver.findElement(staffProfileManagementMenu).click();
        driver.findElement(staffAddMenuItem).click();
        return new StaffAddPage(driver);
    }

    public FeeCollectionPage navigateToFeeCollection() {
        driver.findElement(feeConfigurationMenu).click();
        driver.findElement(feeCollectionMenuItem).click();
        return new FeeCollectionPage(driver);
    }
}
