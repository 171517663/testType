package com.huang.service;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 入口
 * 输入格式为
 *      Input: arr[] = {2, 3}
 *      {2, 3}
 *      2,3,4
 * 不区分空格
 */
public class Main {
    @Test
    public void test() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        Calculator calculator = new Calculator();
        System.out.println(calculator.convertString(str));
    }
}
