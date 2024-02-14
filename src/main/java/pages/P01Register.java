package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class P01Register extends PageBase{
    By MaleGender= By.id("gender-male");
    By FemaleGender= By.id("gender-female");
    By FirstName = By.id("FirstName");
    By LastName = By.id("LastName");
By DayDropDown = By.name("DateOfBirthDay");
By MonthDropDown = By.name("DateOfBirthMonth");
By YearDropDown = By.name("DateOfBirthYear");
By email= By.id("Email");
By company = By.id("Company");
By password = By.id("Password");
By ConfirmPassword = By.id("ConfirmPassword");

By RegisterButton= By.id("register-button");
public void ClickOnGender(){clickOnElement(MaleGender);}
    public void EnterFirstName(){enterText(FirstName, "automation");}
    public void EnterLastName(){enterText(LastName,"Tester");}
    public void EnterEmail(){enterText(email, "test@example2.com");}
    public void EnterCompany(){enterText(company,"abcdef");}
    public void EnterPassword(){enterText(password, "P@ssw0rd");}
    public void ConfirmPassword(){enterText(ConfirmPassword,"P@ssw0rd");}
public void SelectDayOfBirth(){
    Select select= new Select(driver.findElement(DayDropDown));
    select.selectByValue("10");}
    public void SelectMonthOfBirth(){
    Select select = new Select(driver.findElement(MonthDropDown));
    select.selectByValue("4");}
    public void SelectYearOfBirth(){
    Select select= new Select(driver.findElement(YearDropDown));
    select.selectByValue("1996");}
    public P01Register(WebDriver driver) {
        super(driver);
    }
    public void ClickOnRegisterButton(){
    clickOnElement(RegisterButton);
    }
}
