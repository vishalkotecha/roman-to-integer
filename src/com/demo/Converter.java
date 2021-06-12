package com.demo;

import java.util.HashMap;
import java.util.Map;

public class Converter {

    static Map<Character, Integer> map = new HashMap<>();

    static {
        map.put('X', 10);
        map.put('I', 1);
        map.put('V', 5);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public static int fromRomanToNumeric(String romanStr) {

        char[] charArray = romanStr.toCharArray();
        int result = 0;
        int prev = 0;
        for (int i = charArray.length - 1; i >= 0; i--) {
            char currElement = charArray[i];
            if (getValue(currElement) < prev) {
                result -= getValue(currElement);
            } else {
                result += getValue(currElement);
            }
            prev = getValue(currElement);
        }
        return result;

    }

    private static int getValue(char currElement) {
        return map.get(currElement);
    }

}
