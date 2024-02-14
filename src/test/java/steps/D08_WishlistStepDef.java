package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.P03_homePage;
import pages.PageBase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static base.TestBase.driver;
import static org.testng.AssertJUnit.assertTrue;

public class D08_WishlistStepDef {
    P03_homePage p03HomePageObject = new P03_homePage(driver);

    @Given("User open Demo commerce home page")
    public void user_open_demo_commerce_home_page() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/");
    }

    @When("clicks on HTC product")
    public void clicks_on_htc_product() {
        p03HomePageObject.ClickOnHTCProduct();
    }

    @When("clicks on HTC wishlist button")
    public void clicks_on_htc_wishlist_button() {
        p03HomePageObject.ClickOnHTCAddToWishlistButton();
    }
    @When("notification bar displayed in green")
    public void notification_bar_displayed_in_green() {
        WebElement MessageColor = driver.findElement(By.xpath("//div[@class='bar-notification success']"));
String backGroundColor = MessageColor.getCssValue("background-color");
Assert.assertEquals("#4bb07a",backGroundColor);}
    @Then("success message displayed on top")
    public void success_message_displayed_on_top() {
 Assert.assertEquals(driver.findElement(By.xpath("//p[@class='content']")).getText(),"The product has been added to your wishlist");
    }
    @When("Wait until the notification disappear")
    public void wait_until_the_notification_disappear() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("clicks on wishlist tap")
    public void clicks_on_wishlist_tap() {
p03HomePageObject.ClickOnWishListButton();
    }

    @Then("quantity value is more than zero")
    public void quantity_value_is_more_than_zero() {
        WebElement quantityElement = driver.findElement(By.className("qty-input"));
        String quantityText = quantityElement.getText();
        int quantityValue = Integer.parseInt(quantityText);
        assertTrue("quantity is not more than zero",quantityValue>0);
    }
}


