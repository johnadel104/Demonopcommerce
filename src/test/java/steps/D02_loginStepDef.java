package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.HomePage;
import pages.P02Login;

import static base.TestBase.driver;

public class D02_loginStepDef {
   HomePage homePageobject = new HomePage(driver);
   P02Login p02Loginobject = new P02Login(driver);

    @Given("user is in website")
    public void user_is_in_website(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
    }
    @When("user click on login button")
    public void user_click_on_login_button() {
        homePageobject.ClickOnLoginButton();
    }

    @When("enters his email ID")
    public void enters_his_email_id() {
       p02Loginobject.EnterEmail();
    }

    @When("enters his login password")
    public void enters_his_login_password() {
        p02Loginobject.EnterPassword();
    }

    @When("clicks on login button")
    public void clicks_on_login_button() {
       p02Loginobject.ClickOnLoginButton();
    }

    @Then("user logged in his account")
    public void user_logged_in_his_account() {
        Assert.assertEquals(driver.findElement(By.className("ico-account")).getText(),"My account");

    }
    @When("enters invalid email")
    public void enters_invalid_email() {
        p02Loginobject.EnterWrongEmail();
    }

    @Then("error message displayed")
    public void error_message_displayed() {
Assert.assertEquals(driver.findElement(By.className("validation-summary-errors")).getText(),"Login was unsuccessful. Please correct the errors and try again.\n" +
        "No customer account found");
    }
}
