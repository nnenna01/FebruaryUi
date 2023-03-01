package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NopCommerceLoginPage extends BasePage {

    public NopCommerceLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='/login?returnUrl=%2Fcart']")
    private WebElement firstLogInLinkLocator;

    @FindBy(xpath = "//span[@class='cart-label']")
    private WebElement shoppingCartLinkLocator;

    @FindBy(xpath = "//span[@class='cart-qty']")
    private WebElement emptyLinkLocator;

    @FindBy(css = "input[id='Email']")
    private WebElement emailLinkLocator;

    @FindBy(css = "input[id='Password']")
    private WebElement passWordLinkLocator;

    @FindBy(css = "button[class='button-1 login-button']")
    private WebElement LastLogInLinkLocator;

    @FindBy(css = "div[class='message-error validation-summary-errors']")
    private WebElement wrongMessageLocator;
    //Login was unsuccessful. Please correct the errors and try again.
    //////////////////////////////////////////////////////////////////////////////////////////

    public String GetValueOfShoppingBasket() {
        return emptyLinkLocator.getText();
    }

    public boolean IsShoppingCartEmpty() {
        boolean result = false;
        try {
            String value = emptyLinkLocator.getAttribute("You have no items in your shopping cart");
            if (value != null) {
                result = true;
            }
        } catch (Exception e) {
        }
        return result;
    }//at

    // public void clickOnQntLink() {
    //   emptyLinkLocator.click();
    // }

    public boolean IncorrectEmailCredentialsEntered() {
        boolean result = false;
        try {
            String value = emailLinkLocator.getAccessibleName();
            if (value != null) {
                result = true;
            }
        } catch (Exception e) {
        }
        return result;

    }
    //   public void IsIncorrectPasswordEntered(){
    //    passWordLinkLocator.sendKeys("Password");


    // }
    public void IsIncorrectEmailEntered() {
        emailLinkLocator.sendKeys("email");

    }

    public boolean wrongMessageDisplay() {
        boolean result = false;
        try {
            String value = wrongMessageLocator.getText();
            if (value != null) {
                result = true;
            }
        } catch (Exception e) {
        }
        return result;
    }

    public void clickOnLogInLinkLocator() {
        LastLogInLinkLocator.click();
    }

    public void ClickOnPasswordLinkLocator() {
        passWordLinkLocator.sendKeys("password");
    }}

