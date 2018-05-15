package com.zyka.junit5.sample;

import static java.time.Duration.of;
import static java.time.temporal.ChronoUnit.MILLIS;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class T05_TimeoutTest {

    @ParameterizedTest
    @ValueSource(ints = {100, 300})
    public void testTimeout(int sleepTime) {
        assertTimeout(of(200, MILLIS), () -> Thread.sleep(sleepTime));
    }

    @Test
    public void testTimeoutWithReturn() {
        String result = assertTimeout(of(200, MILLIS), () ->  "x");

        assertEquals("x", result);
    }
}
