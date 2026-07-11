package com.example.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringUtilTest {

    @Test
    void reverseLetters_nullCheck() {
        assertEquals("", StringUtil.reverseLetters(null));
    }

    @Test
    void reverseLetters_emptyString() {
        assertEquals("", StringUtil.reverseLetters(""));
    }

    @Test
    void reverseLetters_normalString() {
        assertEquals("t@eb eht av$J!123", StringUtil.reverseLetters("J@va the be$t!123"));
        assertEquals("rt1v3r, 6P0!", StringUtil.reverseLetters("Pr1v3t, 6r0!"));
    }

    @Test
    void reverseLetters_noLetters() {
        assertEquals("1234!@#", StringUtil.reverseLetters("1234!@#"));
    }
    @Test
    void russianLetters()   {
        assertEquals("АБС", StringUtil.reverseLetters("СБА"));
        assertEquals("т07ам адК4?", StringUtil.reverseLetters("К07да мат4?"));
    }
}