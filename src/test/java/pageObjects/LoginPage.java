
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEmail() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LoginPageSelectors.email)));
        return driver.findElement(By.xpath(LoginPageSelectors.email));
    }

    public WebElement getPassword() {
        return driver.findElement(By.xpath(LoginPageSelectors.password));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.xpath(LoginPageSelectors.loginButton));
    }


    public MainPage loginToApp(String email, String password) {
        getEmail().sendKeys(email);
        getPassword().sendKeys(password);
        getLoginButton().click();
        return new MainPage(driver);
    }
}