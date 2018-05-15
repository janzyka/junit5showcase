package com.zyka.junit5.sample;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class T02_TaggingTest {

    @Test
    @Tag("One")
    public void testInCategoryOne() {
        assertTrue(true);
    }

    @Test
    @Tag("Two")
    public void testInCategoryTwo() {
        assertTrue(true);
    }
}
