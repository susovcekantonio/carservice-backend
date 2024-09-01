package com.ericsson.sm.CarApp.validation;

import org.springframework.stereotype.Component;

@Component
public class OibValidation {
    public static final int ERR_INVALID_LENGTH = 1;
    public static final int ERR_INVALID_FORMAT = 2;
    public static final int ERR_INVALID_CONTROL = 3;
    public static final int NO_ERROR = 0;
    public static final int ASCII_DIGITS_OFFSET = 48;

    private static final int asciiDigitsOffset = '0';

    public static boolean checkOIB(String oib) {
        return checkOIBState(oib) == NO_ERROR;
    }

    public static int checkOIBState(String oib) {
        if (oib.length() != 11) {
            return ERR_INVALID_LENGTH;
        }

        char[] chars = oib.toCharArray();

        int a = 10;
        for (int i = 0; i < 10; i++) {
            char c = chars[i];
            if (c < '0' || c > '9') {
                return ERR_INVALID_FORMAT;
            }
            a = a + (c - ASCII_DIGITS_OFFSET);
            a = a % 10;
            if (a == 0) {
                a = 10;
            }
            a *= 2;
            a = a % 11;
        }
        int kontrolni = 11 - a;
        kontrolni = kontrolni % 10;

        if (kontrolni != (chars[10] - ASCII_DIGITS_OFFSET)) {
            return ERR_INVALID_CONTROL;
        }
        return NO_ERROR;
    }
}
