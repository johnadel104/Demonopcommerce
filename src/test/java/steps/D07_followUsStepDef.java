package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.P03_homePage;

import static base.TestBase.driver;

public class D07_followUsStepDef {
    P03_homePage po3_homepageObject= new P03_homePage(driver);

    @Given("user opens demo commerce")
    public void user_opens_demo_commerce() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
    }
    @When("user clicks on facebook button")
    public void user_clicks_on_facebook_button() {
        po3_homepageObject.ClickOnFacebookButton();
    }
    @When("the tab is switched")
    public void the_tab_is_switched() {
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
    }
    @Then("user is in facebook page")
    public void user_is_in_facebook_page() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");
    }
    @When("user clicks on twitter button")
    public void user_clicks_on_twitter_button() {
    po3_homepageObject.ClickOnTwitterButton();
    }

    @When("the tab is switched to twitter")
    public void the_tab_is_switched_to_twitter() {
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
    }
    @Then("user is in twitter page")
    public void user_is_in_twitter_page() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://twitter.com/nopCommerce");
    }
    @When("user clicks on rss button")
    public void user_clicks_on_rss_button() {
po3_homepageObject.ClickOnRssButton();
    }

    @When("the tab is switched to rss")
    public void the_tab_is_switched_to_rss() {
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
    }

    @Then("user is in rss page")
    public void user_is_in_rss_page() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/new-online-store-is-open");
    }
    @When("user clicks on youtube button")
    public void user_clicks_on_youtube_button() {
po3_homepageObject.ClickOnYoutubeButton();
    }

    @When("the tab is switched to youtube")
    public void the_tab_is_switched_to_youtube() {
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
    }

    @Then("user is in youtube page")
    public void user_is_in_youtube_page() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce");
    }
}
