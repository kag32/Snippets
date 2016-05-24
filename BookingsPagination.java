package pages;

import constants.SystemConstants;
import org.openqa.selenium.By;

import static constants.SystemConstants.*;
import static constants.SystemConstants.PAGE_NAVIGATOR.*;

/**
 * Created by Kate on 24/05/2016.
 */
public class BookingsPagination extends Pagination {
    String pageOneFirstCell = null;
    String prevActiveFirstCell = null;
    String activeFirstCell = null;
    String pageMaxFirstCell = null;

    public void BookingsPagination() {
        this.analyseCurrentPage();
        pageOneFirstCell = driver.findElement(By.id("")).getText();
        prevActiveFirstCell = pageOneFirstCell;
    }

    public boolean navigate(PAGE_NAVIGATOR Navigate) {
        switch (Navigate) {
            case NAV_FIRST: {
                this.goToNextPage();
                this.analyseCurrentPage();
                break;
            }
            case NAV_NEXT: {
                this.goToNextPage();
                this.analyseCurrentPage();
                break;
            }
            case NAV_PREVIOUS: {
                this.goToPrevPage();
                this.analyseCurrentPage();
                break;
            }
            case NAV_LAST: {
                this.goToLastPage();
                this.analyseCurrentPage();
                break;
            }
        }
        return true;
    }

    public boolean navigate(Integer PageNo) {
        this.goToPage(PageNo);
        this.analyseCurrentPage();
        return true;
    }

/*
    public boolean nextPage() {
        if (goToNextPage()) {
            this.analyseCurrentPage();
            return true;
        }
        return false;
    }

    public boolean prevPage() {
        if (goToPrevPage()) {
            this.analyseCurrentPage();
            return true;
        }
        return false;
    }

    public boolean pageN(Integer n) {
        return true;
    }

    public boolean maxPage() {
        return true;
    }
*/

}
