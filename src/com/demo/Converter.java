package com.demo;

import java.util.HashMap;
import java.util.Map;

public class Converter {

    static Map<Character, Integer> numbersMap = new HashMap<>();
       
    static {
        numbersMap.put('X', 10);
        numbersMap.put('I', 1);
        numbersMap.put('V', 5);
        numbersMap.put('L', 50);
        numbersMap.put('C', 100);
        numbersMap.put('D', 500);
        numbersMap.put('M', 1000);
    }

    public static int fromRomanToNumeric(String romanStr) {

        char[] charArray = romanStr.toCharArray();

        int result = 0;
        int len = charArray.length;

        for (int i = 0; i < len; i++) {
            char currElement = charArray[i];

            if (i != len - 1 && getValue(currElement) < getValue(charArray[i + 1])) {
                result += getValue(charArray[i + 1]) - getValue(currElement);
                i++;
            } else {
                result += getValue(currElement);
            }
        }
        return result;
    }

    private static int getValue(char currElement) {
        return numbersMap.get(currElement);
    }

}
