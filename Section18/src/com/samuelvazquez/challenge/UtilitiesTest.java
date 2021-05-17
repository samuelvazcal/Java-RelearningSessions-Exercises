package com.samuelvazquez.challenge;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.UTFDataFormatException;

import static org.junit.Assert.*;

public class UtilitiesTest {

    Utilities u;

    @Before
    public void setup() {
        u = new Utilities();
    }

    @Test
    public void everyNthChar() {
        char[] output = u.everyNthChar(new char[]{'h','e','l','l','o'},2);
        assertArrayEquals(new char[] {'e','l'},output);
        char[] output2 = u.everyNthChar(new char[]{'h','e','l','l','o'},7);
        assertArrayEquals(new char[] {'h','e','l','l','o'},output2);
    }

    @Test
    public void removePairs() {
        String stringTest = "AABCDDEFF";
        String actual = u.removePairs(stringTest);
        assertEquals("ABCDEF",actual);
        assertEquals("ABCABDEF",u.removePairs("ABCCABDEEF"));
        assertNull(null,u.removePairs(null));
        assertEquals("A",u.removePairs("A"));
        assertEquals("",u.removePairs(""));
    }

    @Test
    public void converter(){
        int actual = u.converter(10,5);
        assertEquals(300,actual);

    }

    @Test(expected = ArithmeticException.class)
    public void converter_exception() {
        u.converter(10,0);
    }

    @Test
    public void nullIfOddLength() {
        String str1 = "vazquez";
        String str2 = "calvario";
        assertNotNull(u.nullIfOddLength(str2));
        assertNull(u.nullIfOddLength(str1));
    }
}
