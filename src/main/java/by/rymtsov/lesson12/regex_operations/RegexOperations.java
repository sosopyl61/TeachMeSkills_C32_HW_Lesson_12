package main.java.by.rymtsov.lesson12.regex_operations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class contains methods to check if string is
 * a hex color code or a URL.
 * It uses final fields as regular expressions.
 */

public class RegexOperations {
    private static final String HEX_REGEXP = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";
    private static final String URL_REGEXP = "((http|https)://)(www.)?"
            + "[a-zA-Z0-9@:%._\\+~#?&//=]"
            + "{2,256}\\.[a-z]"
            + "{2,6}\\b([-a-zA-Z0-9@:%"
            + "._\\+~#?&//=]*)";

    public static boolean checkIfStringIsHex(String input) {
        if (input == null) {
            return false;
        }
        Pattern p = Pattern.compile(HEX_REGEXP);
        Matcher m = p.matcher(input);
        return m.matches();
    }

    public static boolean checkIfStringIsUrl(String input) {
        if (input == null) {
            return false;
        }
        Pattern p = Pattern.compile(URL_REGEXP);
        Matcher m = p.matcher(input);
        return m.matches();
    }
}
