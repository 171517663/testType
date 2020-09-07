package com.huang.service;

public class Calculator {

    // 限定输入数字长度在[0-99]
    private static final String REGEX = "^[0-9]{1,2}$";

    // 匹配数字[0-9]
    private static final String REGEX_NUM = "^[0-9]{1,1}$";

    public String convertString(String in) throws IllegalArgumentException {

        // 处理字符串
        if (in == null || in.length() == 0) {return "";}
        String numbers = getNumber(in);
        // 字符串校验
        if (numbers.length() == 0) {return "";}
        if(!numbers.matches(REGEX)) {
            return "only support converting the digits from 0 to 99 into letters";
        }
        if (numbers.contains(PhoneButton.ZERO) || numbers.contains(PhoneButton.ONE)) {
            return "0 and 1 do not map to any letters";
        }

        StringBuilder builder = new StringBuilder("Output:");
        calculate(numbers, builder, new StringBuilder());
        return builder.toString();
    }

    private String getNumber(String in) throws IllegalArgumentException {
        String numList = in.replaceAll(" ", "");
        if (numList.toLowerCase().startsWith("input:arr[]={") && numList.endsWith("}")) {
            numList = numList.substring(13, numList.length()-1);
        }
        if (numList.startsWith("{") && numList.endsWith("}")) {
            numList = numList.substring(1, numList.length()-1);
        }
        String[] nums = numList.split(",|，");
        StringBuilder builder = new StringBuilder();

        for(String num:nums) {
            if (num.matches(REGEX_NUM)) {
                builder.append(num);
            } else {
                throw new IllegalArgumentException("wrong number, please enter in this format: Input: arr[] = {2, 3}");
            }
        }
        return builder.toString();
    }

    // 拼接字符串
    private void calculate(String numbers, StringBuilder builder, StringBuilder result) {

        if(numbers.length() <= 0) {
            return ;
        }
        String num = numbers.substring(0, 1);
        char[] chars = PhoneButton.getLetter(num);

        String newNums = numbers.substring(1);
        for(int len = chars.length, pos = 0; pos < len; pos++) {
            result.append(chars[pos]);
            if (newNums.length() <= 0) {
                builder.append(" ");
                builder.append(result);
            }
            calculate(newNums, builder, result);
            result.deleteCharAt(result.length() - 1);
        }
    }


}
