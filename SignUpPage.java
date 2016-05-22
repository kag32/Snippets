package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Kate on 23/04/2016.
 */
public class SignUpPage {

    WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void she_provides_the_first_name_as(String firstName) throws Throwable {
        driver.findElement(By.id("user_first_name")).sendKeys(firstName);
    }


    public void she_provides_the_last_name_as(String lastName) throws Throwable {
        driver.findElement(By.id("user_last_name")).sendKeys(lastName);
    }

    public void she_provides_the_email_as(String email) throws Throwable {
        driver.findElement(By.id("user_email")).sendKeys(email);
    }

    public void she_provides_the_password_as(String password) throws Throwable {
        driver.findElement(By.id("user_password")).sendKeys(password);
    }

    public void she_provides_the_confirm_password_again_as(String confirmPassword) throws Throwable {
        driver.findElement(By.id("user_password_confirmation")).sendKeys(confirmPassword);
    }


    public void she_signs_up() throws Throwable {
        driver.findElement(By.name("commit")).click();
    }
}

