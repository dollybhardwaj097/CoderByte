import org.apitestingframework.Helper.DashboardPage;
import org.apitestingframework.Helper.FeeCollectionPage;
import org.apitestingframework.Helper.LoginPage;
import org.apitestingframework.Helper.StaffAddPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class AddStaffAndFeeCollectionTest extends TestBase {
    WebDriver driver = null;
    @Test(dataProvider = "testData")
    public void addStaffAndFeeCollectionTest(String username, String password, String firstName, String lastName,
                                             String email, String phone, String paymentMode) {

        LoginPage loginPage = new LoginPage(driver);
        DashboardPage dashboardPage = loginPage.login(username, password);
        StaffAddPage staffAddPage = dashboardPage.navigateToStaffAdd();
        staffAddPage.addNewStaff(firstName, lastName, email, phone);

        FeeCollectionPage feeCollectionPage = dashboardPage.navigateToFeeCollection();
        feeCollectionPage.searchStudent("200011312");
        feeCollectionPage.collectFee(paymentMode);
    }
}
