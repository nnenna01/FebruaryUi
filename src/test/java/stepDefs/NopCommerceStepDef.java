package stepDefs;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.hamcrest.CoreMatchers;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.time.Month;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class NopCommerceStepDef extends BaseUtil {
    private BaseUtil base;
    public NopCommerceStepDef(BaseUtil base){
        this.base=base;


    }
    @Given("I am on NopCommerce home page")
    public void i_am_on_nop_commerce_home_page() {
        base.driver.manage().window().maximize();
        base.driver.get("https://demo.nopcommerce.com/");
      //  base.driver.navigate().to("https://demo.nopcommerce.com");

    }
    @Given("I click on Register link")
    public void i_click_on_register_link() {
        base.driver.findElement(By.xpath("//button[@type='submit']")).click();


    }
    @And("I populate only the mandatory fields firstName as {string}, lastname as {string},email as {string}password and confirm password as {string}")
    public void iPopulateOnlyTheMandatoryFieldsFirstNameAsLastnameAsEmailAsPasswordAndConfirmPasswordAs(String firstName, String lastname, String email, String password) {

        base.driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(firstName);
        base.driver.findElement(By.xpath("//input[@data-val-required='Last name is required']")).sendKeys(lastname);
        base.driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
        base.driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
        base.driver.findElement(By.cssSelector("input[id='ConfirmPassword']")).sendKeys( password);


    }

    @Then("Your registration completed")
    public void yourRegistrationCompleted() {
        assertThat(base.driver.findElement(By.xpath("//div[@class='result']")).isDisplayed(),equalTo(true));

    }


    @Given("I click on register button")
    public void i_click_on_register_button() {
        base.driver.findElement(By.cssSelector("button[name='register-button']")).click();

    }

      //  NopCommerceStepDef nopCommerceStepDef=new NopCommerceStepDef(this.driver);

        // Write code here that turns the phrase above into concrete actions




    @And("I populate day as {string}, month as {string}, year as  {string}, and company as {string}")
    public void iPopulateDayAsMonthAsYearAsAndCompanyAs(String day, String month, String year, String company) {

        Select sDay=new Select(base.driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")));
        sDay.selectByVisibleText(day);

        Select sMonth=new Select(base.driver.findElement (By.xpath("//select[@name='DateOfBirthMonth']")));
        sMonth.selectByVisibleText(month);

        Select sYear=new Select(base.driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")));
        sYear.selectByVisibleText(year);

        base.driver.findElement(By.id("Company")).sendKeys(company);



    }


}
