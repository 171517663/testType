package com.huang.service;

import com.huang.util.FileUtil;
import org.junit.Test;

import java.io.*;

/**
 * 入口
 * 输入格式为
 *      Input: arr[] = {2, 3}
 *      {2, 3}
 *      2,3,4
 * 不区分空格和大小写
 */
public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String str = in.readLine();
        String str = FileUtil.readFile("src/main/resources/input.txt");
        Calculator calculator = new Calculator();
        System.out.println(calculator.convertString(str));
    }

}
