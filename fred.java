package stepdefs;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Kate on 05/05/2016.
 */
public class fred {
    WebDriver driver = null;

    @Given("^I am on my zoo website$")
    public void I_am_on_my_zoo_website() throws Throwable {
        driver = new FirefoxDriver();
        driver.navigate().to("http://www.google.com");
    }

    @When("^I click on the contact link$")
    public void I_click_on_the_contact_link() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.id("lst-ib")).sendKeys("swallow");
        Thread.sleep(1000);
        driver.findElement(By.name("btnG")).click();
    }

    @When("^populate the contact form$")
    public void populate_the_contact_form() throws Throwable {
    }

    @Then("^I should be on the contact confirmation page$")
    public void I_should_be_on_the_contact_confirmation_page() throws Throwable {
        System.out.println("");
        System.out.println(driver.getTitle());
        Assert.assertTrue("Not on expected page", driver.getTitle().equals("Google"));
        driver.close();
    }

    /**
     * Created by Kate on 06/05/2016.
     */
    public static class htmlTableFeature {
        @Given("^I am on a table website$")
    public void I_am_on_a_table_website() throws Throwable {
    }

        @Then("^Loop through table rows$")
        public void Loop_through_table_rows() throws Throwable {
           // .//*[@id='main']/table[1]/tbody/tr[1]/th[1]/text()
        }
    }
}
