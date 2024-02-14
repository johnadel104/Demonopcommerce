package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02Login extends PageBase{

    By EmailField= By.name("Email");
    By PasswordField= By.name("Password");
    By LoginButton= By.className("login-button");
    public P02Login(WebDriver driver) {
        super(driver);
    }

    public void EnterEmail(){enterText(EmailField,"test@example2.com");}
    public void EnterPassword(){enterText(PasswordField, "P@ssw0rd");}
    public void ClickOnLoginButton(){clickOnElement(LoginButton);}
    public void EnterWrongEmail(){enterText(EmailField,"wrong@example.com");}
}
