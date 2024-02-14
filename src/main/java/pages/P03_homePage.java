package pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class P03_homePage extends PageBase{
    By SamsungSlider = By.className("nivoSlider");
    By IphoneSlider = By.id("nivo-slider");
    By FacebookButton = By.className("facebook");
    By TwitterButton = By.className("twitter");
    By RssButton = By.className("rss");
    By YoutubeButton = By.className("youtube");
    By HTCProductButton= By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/h2/a");
    By HTCAddToWishlistButton = By.className("add-to-wishlist-button");
By WishlistButton = By.className("ico-wishlist");


    public void ClickOnSamsungSlider(){clickOnElement(SamsungSlider);}
    public void ClickOnIphoneSlider(){clickOnElement(IphoneSlider);}
    public void ClickOnFacebookButton(){clickOnElement(FacebookButton);}
    public void ClickOnTwitterButton(){clickOnElement(TwitterButton);}
    public void ClickOnRssButton(){clickOnElement((RssButton));}
    public void ClickOnYoutubeButton(){clickOnElement(YoutubeButton);}
public void ClickOnHTCProduct(){clickOnElement(HTCProductButton);}
    public void ClickOnHTCAddToWishlistButton(){clickOnElement(HTCAddToWishlistButton);}
    public void ClickOnWishListButton(){clickOnElement(WishlistButton);}
    public P03_homePage(WebDriver driver) {
        super(driver);
    }
}
