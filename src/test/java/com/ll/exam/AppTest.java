package com.ll.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void 더하기() {
        int rs= Calculator.run("10 + 20");
        assertEquals(30,rs);
    }
    @Test
    public void 더하기_2() {
        int rs= Calculator.run("20 + 20");
        assertEquals(40,rs);

    }
    @Test
    public void 빼기() {
        int rs = Calculator.run("10 - 5");
        assertEquals(5, rs);
    }
    @Test
    public void 곱하기() {
        int rs = Calculator.run("10 * 5");
        assertEquals(50, rs);
    }
}
