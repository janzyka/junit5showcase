package com.zyka.junit5.sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class T04_MultipleAssertsTest {

    @Test
    public void testMultipleThings() {
        Assertions.assertAll("Maths",
                () -> Assertions.assertEquals(2, 1 + 1),
                () -> Assertions.assertTrue(3 > 1),
                () -> Assertions.assertTrue(true));
    }
}
