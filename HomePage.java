package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Kate on 23/04/2016.
 */
public class HomePage {

        WebDriver driver;

        public HomePage(WebDriver driver) {
            this.driver = driver;
        }

        public boolean isSignOutLinkDisplayed() throws Throwable {
            return driver.findElement(By.cssSelector("a[href='/users/sign_out']")).isDisplayed();
        }
    }

