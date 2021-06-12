package com.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConverterTest {

    @Test
    void test_for_x() {
        int num = Converter.fromRomanToNumeric("X");
        assertEquals(num, 10);
    }

    @Test
    void test_for_i() {
        int num = Converter.fromRomanToNumeric("I");
        assertEquals(num, 1);
    }
    
    @Test
    void test_for_v() {
        int num = Converter.fromRomanToNumeric("V");
        assertEquals(num, 5);
    }
    
    @Test
    void test_for_l() {
        int num = Converter.fromRomanToNumeric("L");
        assertEquals(num, 50);
    }
    
    @Test
    void test_for_c() {
        int num = Converter.fromRomanToNumeric("C");
        assertEquals(num, 100);
    }
    
    @Test
    void test_for_d() {
        int num = Converter.fromRomanToNumeric("D");
        assertEquals(num, 500);
    }
    
    @Test
    void test_for_m() {
        int num = Converter.fromRomanToNumeric("M");
        assertEquals(num, 1000);
    }
    
    @Test
    void test_for_simple_add_vi() {
        int num = Converter.fromRomanToNumeric("VI");
        assertEquals(num, 6);
    }
    
    @Test
    void test_for_simple_add_xxvi() {
        int num = Converter.fromRomanToNumeric("XXVI");
        assertEquals(num, 26);
    }
    
    @Test
    void test_for_iv() {
        int num = Converter.fromRomanToNumeric("IV");
        assertEquals(4, num);
    }
    
    @Test
    void test_for_random() {
        int num = Converter.fromRomanToNumeric("MCMLXXIV");
        assertEquals(1974,num);
    }
    

}
