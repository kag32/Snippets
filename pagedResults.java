package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Pagination;
import utils.ConsoleOutput;

import static org.junit.Assert.assertTrue;

/**
 * Created by Kate on 15/05/2016.
 */
public class pagedResults {

    public Pagination PG = new Pagination();

    @Given("^I have navigated to a page$")
    public void I_have_navigated_to_a_page() throws Throwable {
        PG.analyseCurrentPage();
        ConsoleOutput.println("active page number is: " + PG.getActivePageNo());
        PG.goToNextPage();
        PG.analyseCurrentPage();
        ConsoleOutput.println("active page number is: " + PG.getActivePageNo());
        PG.goToNextPage();
        PG.analyseCurrentPage();
        ConsoleOutput.println("active page number is: " + PG.getActivePageNo());
        PG.goToNextPage();
        PG.analyseCurrentPage();
        ConsoleOutput.println("active page number is: " + PG.getActivePageNo());
        PG.goToNextPage();
        PG.analyseCurrentPage();
        PG.goToNextPage();
        PG.analyseCurrentPage();
        PG.goToNextPage();
        PG.analyseCurrentPage();
        PG.goToNextPage();
        PG.analyseCurrentPage();
        PG.goToPrevPage();
        PG.analyseCurrentPage();
        assertTrue("Link to page 42 is not visible",PG.goToPage(10));
        //PG.processDropDown();
    }

    @When("^I click on results page link$")
    public void I_click_on_results_page_link() throws Throwable {
    }

    @Then("^I am taken to the corresponding results page$")
    public void I_am_taken_to_the_corresponding_results_page() throws Throwable {
    }
}
