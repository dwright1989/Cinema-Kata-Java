package org.techreturners;

import java.util.regex.Pattern;

public class Validation {

    public static boolean isValidSelection(String number){
        return Pattern.matches("^(0|[1-9][0-9]*)$", number) && (number.equals("1") || number.equals("2"));
    }
}
