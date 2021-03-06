package com.huang.service;

public class PhoneButton {
    public static final String ZERO = "0";
    public static final String ONE = "1";
    public static final String TWO = "2";
    public static final String THREE = "3";
    public static final String FOUR = "4";
    public static final String FIVE = "5";
    public static final String SIX = "6";
    public static final String SEVEN = "7";
    public static final String EIGHT = "8";
    public static final String NINE = "9";

    public static final char[] ZERO_LETTER = new char[]{};
    public static final char[] ONE_LETTER = new char[]{};
    public static final char[] TWO_LETTER = new char[]{'a', 'b', 'c'};
    public static final char[] THREE_LETTER = new char[]{'d', 'e', 'f'};
    public static final char[] FOUR_LETTER = new char[]{'g', 'h', 'i'};
    public static final char[] FIVE_LETTER = new char[]{'j', 'k', 'l'};
    public static final char[] SIX_LETTER = new char[]{'m', 'n', 'o'};
    public static final char[] SEVEN_LETTER = new char[]{'p', 'q', 'r', 's'};
    public static final char[] EIGHT_LETTER = new char[]{'t', 'u', 'v'};
    public static final char[] NINE_LETTER = new char[]{'w', 'x', 'y', 'z'};

    public static char[] getLetter(String number) {
        switch (number) {
            case PhoneButton.TWO:
                return PhoneButton.TWO_LETTER;
            case PhoneButton.THREE:
                return PhoneButton.THREE_LETTER;
            case PhoneButton.FOUR:
                return PhoneButton.FOUR_LETTER;
            case PhoneButton.FIVE:
                return PhoneButton.FIVE_LETTER;
            case PhoneButton.SIX:
                return PhoneButton.SIX_LETTER;
            case PhoneButton.SEVEN:
                return PhoneButton.SEVEN_LETTER;
            case PhoneButton.EIGHT:
                return PhoneButton.EIGHT_LETTER;
            case PhoneButton.NINE:
                return PhoneButton.NINE_LETTER;
            default:
                return PhoneButton.ZERO_LETTER;
        }
    }

}
