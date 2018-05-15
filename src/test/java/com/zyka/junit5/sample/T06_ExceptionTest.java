package com.zyka.junit5.sample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class T06_ExceptionTest {

    @Test
    public void testExceptions() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("Something is wrong");
        });

        assertEquals("Something is wrong", ex.getMessage());
    }
}
