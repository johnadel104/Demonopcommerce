package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.HomePage;
import pages.P01Register;

import static base.TestBase.driver;

public class D01_registerStepDef {
    HomePage homePageobject = new HomePage(driver);
    P01Register p01Registerobject = new P01Register(driver);

@Given("user is in home page")
    public void user_is_in_home_page(){
    Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
}
    @When("user click on register button")
    public void user_click_on_register_button() {
homePageobject.ClickOnRegisterButton();
    }

    @When("clicks on gender")
    public void clicks_on_gender() { p01Registerobject.ClickOnGender();

    }

    @When("enters his first name")
    public void enters_his_first_name() {
p01Registerobject.EnterFirstName();
    }

    @When("enters his last name")
    public void enters_his_last_name() {
p01Registerobject.EnterLastName();
    }

    @When("selects day of birthdate")
    public void selects_day_of_birthdate() {
p01Registerobject.SelectDayOfBirth();
    }

    @When("selects month of birthdate")
    public void selects_month_of_birthdate() {
p01Registerobject.SelectMonthOfBirth();
    }

    @When("selects year of birthdate")
    public void selects_year_of_birthdate() {
p01Registerobject.SelectYearOfBirth();
    }
@When("enters his email")
public void enters_his_email(){
p01Registerobject.EnterEmail();
}
    @When("enters his password")
    public void enters_his_password() {
p01Registerobject.EnterPassword();
    }

    @When("confirms password")
    public void confirms_password() {
p01Registerobject.ConfirmPassword();
}

    @When("clicks on register button")
    public void clicks_on_register_button() {
p01Registerobject.ClickOnRegisterButton();
    }

    @Then("success message displayed")
    public void success_message_displayed() {
        Assert.assertEquals(driver.findElement(By.className("result")).getText() , "Your registration completed");
    }
}

