package stepdefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

/**
 * Created by Kate on 23/04/2016.
 */
public class StartingSteps {

    private WebDriver driver;


    @Before
    public void beforeScenario() {
        //driver = new DriverFactory().getDriver();
        System.out.println("this will run before the actual scenario");
    }

    @After
    public void afterScenario() {
        //new DriverFactory().destroyDriver();
        System.out.println("this will run after scneario is finished, even if it failed");
    }


    @Given("^user is on landing page$")
    public void setup() throws Throwable {
        //driver.get("http://www.google.com");
        //driver.manage().window().maximize();
    }

    @Then("fred")
    public void fred() throws Throwable {

    }

    @Before("@Signup-DataDriven")
    public void signupSetup() {
        System.out.println("This should run everytime before any of the @Signup-DataDriven tagged scenario is going to run");
    }

    @After("@Signup-DataDriven")
    public void signupTeardown() {
        System.out.println("This should run everytime after any of the @Signup-DataDriven tagged scenario has run");
    }


}

