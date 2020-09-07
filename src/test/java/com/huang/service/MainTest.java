package com.huang.service;

import com.huang.util.PhoneButton;
import org.junit.Test;

import java.io.IOException;

public class MainTest {

    @Test
    public void test() throws IOException {
        Calculator calculator = new Calculator();
        try {
            calculator.convertString("{1}");
            calculator.convertString("{0}");
        } catch (IOException e) {
            e.printStackTrace();
        }
        calculator.convertString("{1,2}");
        calculator.convertString("{9,2}");
        calculator.convertString("{3,4}");
        calculator.convertString("{5,6}");
        calculator.convertString("{7,8}");
        calculator.convertString("{7,8,9}");
        PhoneButton.getLetter("0");
        Main.main(new String[]{});

        calculator.convertString("Input: arr[] = {1,2,3,4}");

        try {
            calculator.convertString("{22,33}");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            calculator.convertString("{4,aa}");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Main.main(new String[]{});

    }
}
