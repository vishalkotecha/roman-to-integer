package com.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConverterTest {

    @Test
    void test_for_x() {
        int num = Converter.fromRomanToNumeric("X");
        assertEquals(10,num);
    }

    @Test
    void test_for_i() {
        int num = Converter.fromRomanToNumeric("I");
        assertEquals(1,num);
    }
    
    @Test
    void test_for_v() {
        int num = Converter.fromRomanToNumeric("V");
        assertEquals(5,num);
    }
    
    @Test
    void test_for_l() {
        int num = Converter.fromRomanToNumeric("L");
        assertEquals(50,num);
    }
    
    @Test
    void test_for_c() {
        int num = Converter.fromRomanToNumeric("C");
        assertEquals(100,num);
    }
    
    @Test
    void test_for_d() {
        int num = Converter.fromRomanToNumeric("D");
        assertEquals(500,num);
    }
    
    @Test
    void test_for_m() {
        int num = Converter.fromRomanToNumeric("M");
        assertEquals(1000,num);
    }
    
    @Test
    void test_for_simple_add_vi() {
        int num = Converter.fromRomanToNumeric("VI");
        assertEquals(6,num);
    }
    
    @Test
    void test_for_simple_add_xxvi() {
        int num = Converter.fromRomanToNumeric("XXVI");
        assertEquals(26,num);
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
