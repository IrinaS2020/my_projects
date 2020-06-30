package helpers;

import enums.Browsers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserFabric {
    public static WebDriver getDriver(Browsers browser) throws NoSuchFieldException {
        switch (browser) {
            case FIREFOX:
                return getFirefoxDriver();
            case OPERA:
                return getOperaDriver();
            case CHROME:
                return getChromeDriver();
            default:
                throw new NoSuchFieldException("No such browser");

        }
    }

    private static WebDriver getFirefoxDriver() {
        System.setProperty("webdriver.geko.driver", "geckodriver");
        return new FirefoxDriver();
    }

    private static WebDriver getOperaDriver() {
        System.setProperty("webdriver.opera.driver", "operadriver");
        return new OperaDriver();
    }

    private static WebDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        return new ChromeDriver();
    }
}
