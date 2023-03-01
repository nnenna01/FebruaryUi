package stepDefs;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NopCommerceLoginStepDef extends BaseUtil {

    private BaseUtil base;


    public NopCommerceLoginStepDef(BaseUtil base) {
        this.base = base;
    }

    @Given("I have no item in the shopping cart")
    public void i_have_no_item_in_the_shopping_cart() {
        assertThat(base.driver.findElement(By.xpath("//span[@class='cart-qty']")).getText(), is(equalTo(("(0)"))));

    }

    @And("I click on Login link")
    public void iClickOnLoginLink() throws InterruptedException {
        base.driver.findElement(By.xpath("//a[@class='ico-login']")).click();
        Thread.sleep(3000);
    }

    @When("I attempt to login using incorrect credentials with Email as {string} and Password as {string}")
    public void iAttemptToLoginUsingIncorrectCredentialsWithEmailAsAndPasswordAs(String eMail, String pWord) {
        base.driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("nne" + eMail);
        base.driver.findElement(By.cssSelector("input[id='Password']")).sendKeys((pWord));
    }

    @When("I click Login button")
    public void iClickLonginButton() {
        base.driver.findElement(By.linkText("Log in")).click();
    }

    @Then("I should get the appropriate error message displayed as per design {string}")
    public void i_should_get_the_appropriate_error_message_displayed_as_per_design(String string) {
        assertThat(base.driver.findElement(By.xpath("//div[@Class='message-error validation-summary-errors']")).isDisplayed(),is(equalTo(true)));
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @When("I enter invalid Email format as {string} and password as {string}")
    public void iEnterInvalidEmailFormatAsAndPasswordAs(String eMail, String password) {
        base.driver.findElement(By.cssSelector("input[id='Email']")).sendKeys((eMail));
        base.driver.findElement(By.cssSelector("input[id='Password']")).sendKeys(password);
    }

    @Then("should get the appropriate error message displayed as per design {string}")
    public void shouldGetTheAppropriateErrorMessageDisplayedAsPerDesign(String arg0) {
        assertThat(base.driver.findElement(By.cssSelector("span[id=Email-error]")).isDisplayed(), is(equalTo(true)));
    }


    @And("I enter Email as {string} and Password as \"nee.gee.com")
    public void iEnterEmailAsAndPasswordAsNeeGeeCom(String string) {
        base.driver.findElement(By.cssSelector("input[id='Email']")).sendKeys(string);
        base.driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("password");
    }

    @Then("I should get the appropriate error message displayed as per design \\{string{string}}")
    public void iShouldGetTheAppropriateErrorMessageDisplayedAsPerDesignString(String msg) {
        assertThat(base.driver.findElement(By.xpath("//span[@id='Email-error']")).isDisplayed(), equalTo(true));
    }


    @And("I leave the email field blank and I enter the right password as {string}")
    public void iLeaveTheEmailFieldBlankAndIEnterTheRightPasswordAs(String password) {
        base.driver.findElement(By.cssSelector("input[id='Password']")).sendKeys(password);
    }

    @Then("Then should get the appropriate error message displayed as per design \\{string{string}}")
    public void thenShouldGetTheAppropriateErrorMessageDisplayedAsPerDesignString(String arg0) {
        assertThat(base.driver.findElement(By.xpath("//span[contains(text(),'Please enter your email')]")).isDisplayed(), is(equalTo(true)));
    }



    }
