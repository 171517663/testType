package com.huang.service;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class MainTest {

    @Test
    public void test4() {
        Calculator calculator = new Calculator();
        String str1 = calculator.convertString("Input: arr[] = {3,4}");
        String str2 = calculator.convertString("{3,4}");
        String str3 = calculator.convertString("3,4");
        Assert.assertEquals(str1, str2);
        Assert.assertEquals(str1, str3);
        Assert.assertTrue(str1.equals("Output: dg dh di eg eh ei fg fh fi"));
    }

    @Test
    public void test() {
        Calculator calculator = new Calculator();
        String str1 = calculator.convertString("{1}");
        String str2 = calculator.convertString("{0}");
        String str3 = calculator.convertString("{1,2}");
        String str4 = calculator.convertString("{7,8,9}");
        String str5 = calculator.convertString("{8,9}");
        Assert.assertEquals(str1, "0 and 1 do not map to any letters");
        Assert.assertEquals(str2, "0 and 1 do not map to any letters");
        Assert.assertEquals(str3, "0 and 1 do not map to any letters");
        Assert.assertEquals(str4, "only support converting the digits from 0 to 99 into letters");
        Assert.assertTrue(str5.equals("Output: tw tx ty tz uw ux uy uz vw vx vy vz"));
    }

    @Test
    public void test2() {
        Calculator calculator = new Calculator();
        calculator.convertString("{9,2}");
        calculator.convertString("{3,4}");
        calculator.convertString("{5,6}");
        calculator.convertString("{7,8}");
        PhoneButton.getLetter("0");
    }

    @Test
    public void test3() throws IOException {
        Main.main(new String[]{});
    }

    @Test(expected = IllegalArgumentException.class)
    public void test5() {
        Calculator calculator = new Calculator();
        calculator.convertString("{22,33}");
    }

    @Test(expected = IllegalArgumentException.class)
    public void test6() {
        Calculator calculator = new Calculator();
        calculator.convertString("{4,aa}");
    }
}
