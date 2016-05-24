package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConsoleOutput;

import java.util.List;


/**
 * Created by Kate on 15/05/2016.
 */
public class Pagination {
    public static WebDriver driver;
    private String s = null;
    private Integer ix_one = null;
    private Integer ix_first = null;
    private Integer ix_last = null;
    private Integer ix_active = null;
    private Integer ix_next = null;
    private Integer ix_prev = null;
    private Integer active_page_no = null;

    private Integer prev_active_page_no = null;
    private Integer max_page_no = null;

    List<WebElement> AllCheckBoxes = null;

    public Integer getActivePageNo() {
        return active_page_no;
    }

    public void analyseCurrentPage() {
        if (driver == null) {
            try {
                driver = new FirefoxDriver();
                driver.navigate().to("http://www.primefaces.org/showcase/ui/data/dataexporter/basic.xhtml");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                driver.close();
            }
        }
        if (driver != null) {
            try {
                s = null;
                ix_one = null;
                ix_first = null;
                ix_last = null;
                ix_active = null;
                ix_next = null;
                ix_prev = null;
                active_page_no = null;
                AllCheckBoxes = null;
                Thread.sleep(1000);
                WebElement wb2 = (new WebDriverWait(driver, 10))
                        .until(ExpectedConditions.presenceOfElementLocated(By.id("j_idt89:tbl_paginator_top")));
                AllCheckBoxes = wb2.findElements(By.xpath("//a"));
                // Get the count of check boxes
                int RowCount = wb2.findElements(By.xpath("//a")).size();
                // Check the check boxes based on index
                ConsoleOutput.println("before loop " + RowCount);
                for (int i = 0; i < RowCount; i++) {
                    //witch
                    //AllCheckBoxes.get(i).click();
                    s = AllCheckBoxes.get(i).getAttribute("aria-label") + "";
                    if (s.contains("Page")) {
                        System.out.println("~~~~~~");
                        System.out.println(AllCheckBoxes.get(i).getText());
                        if (AllCheckBoxes.get(i).getAttribute("class").contains("ui-state-active")) {
                            //System.out.println("ui-state-active" + AllCheckBoxes.get(i).getText());
                            ix_active = i;
                            active_page_no = Integer.parseInt(AllCheckBoxes.get(i).getText());
                            ConsoleOutput.println("page value active = " + AllCheckBoxes.get(i).getText());
                            ConsoleOutput.println("index value active = " + i);
                        } else if (AllCheckBoxes.get(i).getAttribute("class").contains("ui-paginator-first")) {
                            //System.out.println("ui-state-active" + AllCheckBoxes.get(i).getText());
                            ix_first = i;
                            ConsoleOutput.println("index value first = " + i);
                        } else if (AllCheckBoxes.get(i).getAttribute("class").contains("ui-paginator-prev")) {
                            //System.out.println("ui-state-active" + AllCheckBoxes.get(i).getText());
                            ix_prev = i;
                            ConsoleOutput.println("index value prev = " + i);
                        } else if (AllCheckBoxes.get(i).getText().equals("1")) {
                            ix_one = i;
                            ConsoleOutput.println("index value one = " + i);
                        } else if (AllCheckBoxes.get(i).getAttribute("class").contains("ui-paginator-next")) {
                            //System.out.println("ui-state-active" + AllCheckBoxes.get(i).getText());
                            ix_next = i;
                            //we_next = AllCheckBoxes.get(i);
                            ConsoleOutput.println("index value next = " + i);
                        } else if (AllCheckBoxes.get(i).getAttribute("class").contains("ui-paginator-last")) {
                            //System.out.println("ui-state-active" + AllCheckBoxes.get(i).getText());
                            ix_last = i;
                            ConsoleOutput.println("index value last = " + i);
                            //AllCheckBoxes.get(i).click();
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }


    public boolean goToNextPage() {
        try {
            AllCheckBoxes.get(ix_next).click();
        } catch (Exception e) {
            System.out.println("");
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean goToPrevPage() {
        try {
            AllCheckBoxes.get(ix_prev).click();
        }
        catch (Exception e) {
            System.out.println("goToPrevPage " + e.getMessage());
            return false;
        }
        return true;
    }

    public boolean goToPage(Integer n) {
        try {
            AllCheckBoxes.get(ix_one + n - 1).click();
        } catch (Exception e) {
            System.out.println("goToPage " + n + " " + e.getMessage());
            return false;
        }
        return true;
    }


    public void goToLastPage() {
        goToPage(max_page_no);
    }

    public void processDropDown() {
        // go to the website
        driver.get("http://www.primefaces.org/showcase/ui/ajax/dropdown.xhtml");
        // find and click the label
        WebElement dropDown =
                driver.findElement(By.xpath("//label[text()='Select Country']"));
        dropDown.click();
        // get all the LI elements where position() > 1
        List<WebElement> options =
                driver.findElements(By.xpath("//li[text()='Select Country']/../li[position() > 1]"));
        for (WebElement option : options) {
            ConsoleOutput.println("");
            ConsoleOutput.println(option.getText());
        }
    }
}
