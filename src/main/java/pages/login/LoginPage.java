package pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private final By LoginField = By.id("LoginForm_username");
    public LoginPage enterLogin() {
        driver.findElement(LoginField).sendKeys("ADMIN_EMAIL");
        return this;
    }
    private final By PasswordField = By.id("LoginForm_password");
    public LoginPage enterPassword() {
        driver.findElement(LoginField).sendKeys("CORRECT_PASSWORD");
        return this;
    }
    private final By LoginButton = By.cssSelector("[value='Login']");
    public LoginPage clickLoginButton() {
        driver.findElement(LoginButton).click();
        return this;
    }
}
