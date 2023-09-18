package com.sampleservice.demo.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MiscTest {
    /**
     * Method under test: {@link Misc#calculateFactorial(int)}
     */
    @Test
    public void testCalculateFactorial() {
        assertEquals(3628800L, Misc.calculateFactorial(10));
    }
}

