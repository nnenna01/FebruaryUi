package stepDefs;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NopCommerceE2EStepDefs extends BaseUtil {
    private BaseUtil base;

    public NopCommerceE2EStepDefs(BaseUtil base) {
        this.base = base;
    }

    @Given("I am not logged in")
    public void i_am_not_logged_in() {
        assertThat(base.driver.findElement(By.linkText("Log in")).isDisplayed(),is(equalTo(true)));
    }
    @When("I click on Computers link")
    public void i_click_on_computers_link() {
        base.driver.findElement(By.linkText("Computers")).click();
    }
    @When("I click on Desktops link")
    public void i_click_on_desktops_link() {
      base.driver.findElement(By.linkText("Desktops")).click();
    }

    @When("I click on {string} link")
    public void i_click_on_link(String bYOC) {
    base.driver.findElement(By.linkText(bYOC)).click();

    }
    @When("I select {string} of RAM and {string} of HDD")
    public void i_select_of_ram_and_of_hdd(String gb, String hdd) {
    new Select(base.driver.findElement(By.cssSelector("select[id='product_attribute_2']"))).selectByValue("3");
    base.driver.findElement(By.cssSelector("input[id='product_attribute_3_6']")).click();
    }
    @And("I click on the {string} button")
    public void iClickOnTheButton(String AddToCart) {
        base.driver.findElement(By.xpath("//button[@id='add-to-cart-button-1']")).click();
    }
    @And("I click on the {string} link on top")
    public void iClickOnTheLinkOnTop(String shoppingCart) throws InterruptedException {
        Thread.sleep(2000);
        base.driver.findElement(By.linkText("shopping cart")).click();

    }

    @And("I click on the above {string} link on top")
    public void iClickOnTheAboveLinkOnTop(String shoppingCart){
    assertThat(base.driver.findElement(By.linkText("shopping cart")).isDisplayed(),is(equalTo(true)));
    base.driver.findElement(By.linkText("shopping cart")).click();
    }

    @When("I click on Agree to terms check box")
    public void i_click_on_agree_to_terms_check_box() {
    base.driver.findElement(By.cssSelector("input[id='termsofservice']")).click();

    }
    @When("I click on CHECKOUT button")
    public void i_click_on_checkout_button() {
    base.driver.findElement(By.cssSelector("button[id='checkout']")).click();

    }
    @Then("{string} page is displayed")
    public void page_is_displayed(String string) {
     assertThat(base.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[1]/h1")).isDisplayed(),is(equalTo(true)));
    }


}