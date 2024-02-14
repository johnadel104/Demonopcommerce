package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.P03_homePage;

import static base.TestBase.driver;

public class D06_homeSlidersStepDef {
    P03_homePage po3_homepageObject= new P03_homePage(driver);
    @Given("user is in site")
    public void user_is_in_site(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
    }


    @When("user clicks on Samsung slider")
    public void user_clicks_on_samsung_slider() {
     po3_homepageObject.ClickOnSamsungSlider();

    }
    @Then("user is directed to Samsung page")
    public void user_is_directed_to_samsung_page() {
     Assert.assertEquals(driver.getCurrentUrl(),"://demo.nopcommerce.com/Galaxy-S22-Ultra");
    }

        @When("user clicks on Iphone slide")
        public void user_clicks_on_iphone_slide() {
po3_homepageObject.ClickOnIphoneSlider();
        }

        @Then("user is redirected to Iphone page")
        public void user_is_redirected_to_iphone_page() {
            Assert.assertEquals(driver.getCurrentUrl(),"://demo.nopcommerce.com/iphone-14-pro");
        }
}

