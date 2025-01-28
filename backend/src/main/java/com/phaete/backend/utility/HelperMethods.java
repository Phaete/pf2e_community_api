package com.phaete.backend.utility;

public class HelperMethods {

    private HelperMethods() {
    }

    public static String capitalize(String string) {
        if(string == null || string.length() <= 1) {
            return string;
        }
        return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

}
