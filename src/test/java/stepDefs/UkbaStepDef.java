package stepDefs;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class UkbaStepDef extends BaseUtil {
    private BaseUtil base;

    public UkbaStepDef(BaseUtil base) {
        this.base = base;
    }

    @Given("I am on {string}")
    public void i_am_on(String string) {
        base.driver.manage().window().maximize();
        base.driver.get("https://www.gov.uk/check-uk-visa/y");
    }


    @When("I provide nationality of {string}")
    public void i_provide_nationality_of(String countryName) {
        Select select = new Select(base.driver.findElement(By.id("response")));
        select.selectByVisibleText(countryName);
    }

    @When("I click on Continue button")
    public void i_click_on_continue_button() {
        base.driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
    }


    @When("I select reason as {string}")
    public void i_select_reason_as(String study) {
        base.driver.findElement(By.id("response-2")).click();

    }

    @When("I state I intend to stay for more than {int} months")
    public void i_state_i_intend_to_stay_for_more_than_months(Integer int1) {
        base.driver.findElement(By.id("response-1")).click();

    }

    @Then("I should be informed that {string}")
    public void i_should_be_informed_that(String msg) {
    assertThat(base.driver.findElement(By.xpath("//h2[contains(text(),'You’ll need a visa to study in the UK')]")).isDisplayed(),is(equalTo(true)));
    //  assertThat(base.driver.findElement(By.xpath("//h2[contains(text(),'"  +  msg  +  "')]")).isDisplayed(), is(equalTo(true)));
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Given("I provide a nationality of {string}")
    public void i_provide_a_nationality_of(String countryName) {
     //   base.driver.findElement(By.id("response"));
        Select select = new Select(base.driver.findElement(By.xpath("//select[@class='govuk-select']")));
        select.selectByVisibleText(countryName);

    }

    @Given("I select the reason as {string}")
    public void i_select_the_reason_as(String tourism) {
        base.driver.findElement(By.xpath("//label[@for='response-0']")).click();

    }
        @Then("I will be informed {string}")
    public void i_will_be_informed(String msg) {
        assertThat(base.driver.findElement(By.xpath("//div[@class='govuk-!-margin-bottom-6']")).isDisplayed(),is(equalTo(true)));

    }


    @Given("I select {string} button for travelling with or visiting partner or family member")
    public void i_select_button_for_travelling_with_or_visiting_partner_or_family_member(String string) {
        base.driver.findElement(By.xpath("//label[@for='response-0']")).click();

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    
}