package hwPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public MainPage loginToApp (String email, String password){
            getEmail().sendKeys(email);
            getPassword().sendKeys(password);
            getLoginButton().click();
            return new MainPage(driver);

        }
        public WebElement getEmail() {
        fluentWait.until(x->x.findElement(By.xpath("[type='email']")));
        return driver.findElement(By.xpath("[type='email']"));
    }
    public WebElement getPassword() { return driver.findElement(By.xpath("[type='password']"));}
    public WebElement getLoginButton () { return driver.findElement(By.xpath("//*[contains(@type,'subm')]"));}


//
    public boolean isError(){
//        var errors = driver.findElements(By.xpath("//*[@class='error']"));
//        return errors.size()==1;
        try {
            driver.findElement(By.xpath("//*[@class='error']"));
        } catch (NoSuchElementException error){
            return false;
        }
        return true;
    }
        }
