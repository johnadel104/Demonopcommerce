package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase{
    By RegisterButton = By.className("ico-register");
    By LoginButton= By.className("ico-login");

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void ClickOnRegisterButton(){clickOnElement(RegisterButton);}
    public void ClickOnLoginButton(){clickOnElement(LoginButton);}
}
