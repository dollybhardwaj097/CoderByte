import org.apitestingframework.Utilities.ExcelUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

    public class TestBase {
        protected WebDriver driver;

        @BeforeSuite
        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "/Users/dollybhardwaj/Downloads/CodeByte/chromedriver_mac64/chromedriver");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }

        @AfterSuite
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }

        @DataProvider(name = "testData")
        public Object[][] getTestData() {
            return ExcelUtils.readTestData("testdata.xlsx", "Sheet1");
        }
    }


