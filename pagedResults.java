package stepdefs;

import constants.SystemConstants;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.BookingsPagination;
import utils.ConsoleOutput;

import static constants.SystemConstants.PAGE_NAVIGATOR.NAV_LAST;
import static constants.SystemConstants.PAGE_NAVIGATOR.NAV_NEXT;
import static constants.SystemConstants.PAGE_NAVIGATOR.NAV_PREVIOUS;
import static org.junit.Assert.assertTrue;

/**
 * Created by Kate on 15/05/2016.
 */
public class pagedResults {

    public BookingsPagination PG = new BookingsPagination();

    @Given("^I have navigated to a page$")
    public void I_have_navigated_to_a_page() throws Throwable {
    }

    @When("^I click on results page link$")
    public void I_click_on_results_page_link() throws Throwable {
    }

    @Then("^I am taken to the corresponding results page$")
    public void I_am_taken_to_the_corresponding_results_page() throws Throwable {
    }

    @When("^I click on next page link$")
    public void I_click_on_next_page_link() throws Throwable {
        Assert.assertTrue(PG.navigate(NAV_NEXT));
    }

    @When("^I click on previous page link$")
    public void I_click_on_previous_page_link() throws Throwable {
        Assert.assertTrue(PG.navigate(NAV_PREVIOUS));
    }

    @When("^I click on last page link$")
    public void I_click_on_last_page_link() throws Throwable {
        Assert.assertTrue(PG.navigate(NAV_LAST));
    }

    @When("^I click on page \"([^\"]*)\" link$")
    public void I_click_on_page_link(String pageNo) throws Throwable {
        Assert.assertTrue(PG.navigate(Integer.parseInt(pageNo)));
    }
}
