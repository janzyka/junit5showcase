package com.zyka.junit5.sample;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;

public class T01_AssumptionsTest {

    @Test
    public void assumptionNotMet() {
        assumeTrue("CI".equals(System.getenv("ENV")));

        assertFalse(true);
    }
}
