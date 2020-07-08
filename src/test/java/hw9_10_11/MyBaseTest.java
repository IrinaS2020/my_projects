package hw9_10_11;

import enums.Browsers;
import helpers.BrowserFabric;
import helpers.GetScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageObjects.LoginPage;
import pageObjects.MainPage;

import java.util.concurrent.TimeUnit;

public class MyBaseTest {
    protected WebDriver driver;
    protected MainPage mainPage;
    @BeforeMethod
    public void startUp() throws NoSuchFieldException {

        driver= BrowserFabric.getDriver(Browsers.CHROME);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://koelapp.testpro.io");
        LoginPage loginPage = new LoginPage(driver);
        mainPage = loginPage.loginToApp("testpro.user03@testpro.io","te$t$tudent");
    }
        @AfterMethod
        public void tearDown(ITestResult iTestResult) throws InterruptedException {
            if(iTestResult.getStatus()==iTestResult.FAILURE){
                GetScreenshot.capture(driver,iTestResult.getName());
            }
            driver.quit();
    }
}
