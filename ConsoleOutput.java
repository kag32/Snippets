package utils;

import static constants.SystemConstants.VERBOSITY;
import static constants.SystemConstants.VERBOSITY.IGNORED;

/**
 * Created by Kate on 21/05/2016.
 */
public class ConsoleOutput {
    public static void println(VERBOSITY verbosity, String content) {
        switch (verbosity) {
            case FULL: {
                System.out.println("");
                System.out.println("VERBOSITY FULL " + content);
                break;
            }
            case SPECIFIC: {
                System.out.println("");
                System.out.println("VERBOSITY SPECIFIC " + content);
                break;
            }
            case NONE: {
                break;
            }
            case IGNORED: {
                System.out.println("");
                System.out.println(content);
                break;
            }
        }
    }

    public static void println(String content) {
        println(IGNORED, content);
    }
}
