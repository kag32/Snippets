package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LandingPage;

/**
 * Created by Kate on 03/05/2016.
 */
public class NewClientWorkflow {

    @Given("^the user is on landing page$")
    public void the_user_is_on_landing_page() throws Throwable {
     //LP.
    }

    @When("^she chooses to sign up$")
    public void she_chooses_to_sign_up() throws Throwable {
    }

    @When("^she provides the first name as Sukesh$")
    public void she_provides_the_first_name_as_Sukesh() throws Throwable {
    }

    @When("^she provides the last name as Kumar$")
    public void she_provides_the_last_name_as_Kumar() throws Throwable {
    }

    @When("^she provides the email as validemail@aq.com$")
    public void she_provides_the_email_as_validemail_aq_com() throws Throwable {
    }

    @When("^she provides the password as password$")
    public void she_provides_the_password_as_password() throws Throwable {
    }

    @When("^she provides the confirm password again as password$")
    public void she_provides_the_confirm_password_again_as_password() throws Throwable {
    }

    @When("^she signs-up$")
    public void she_signs_up() throws Throwable {
    }

    @Then("^she should be logged in to the application$")
    public void she_should_be_logged_in_to_the_application() throws Throwable {
    }

}
