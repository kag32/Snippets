package constants;

/**
 * Created by Kate on 21/05/2016.
 */
public class SystemConstants {
    // verbosity console output
    public enum VERBOSITY {FULL, SPECIFIC, NONE, IGNORED}
    //
    public static String UI_STATE_ACTIVE = "ui-state-active";
    public static String UI_PAGINATOR_FIRST = "ui-paginator-first";
    public static String UI_PAGINATOR_PREV = "ui-paginator-prev";
    public static String UI_PAGINATOR_NEXT = "ui-paginator-next";
    public static String UI_PAGINATOR_LAST = "ui-paginator-last";
    public enum UI_STATE {UI_STATE_ACTIVE, UI_PAGINATOR_FIRST, UI_PAGINATOR_PREV, UI_PAGINATOR_NEXT, UI_PAGINATOR_LAST};

 /*   public static String NAV_FIRST = "navigate_to_first_page";
    public static String NAV_NEXT = "navigate_to_first_page";
    public static String NAV_PREVIOUS = "navigate_to_first_page";
    public static String NAV_LAST = "navigate_to_first_page"; */
    public enum PAGE_NAVIGATOR {NAV_FIRST, NAV_NEXT, NAV_PREVIOUS, NAV_LAST};
}


