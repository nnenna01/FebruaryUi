package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NopcommerceHomePage extends BasePage{

    public NopcommerceHomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "a[class='ico-register']")private WebElement registerLink;
    ////////////



    public void clickOnRegisterLink(){
        registerLink.click();
    }
}
