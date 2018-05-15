package com.zyka.junit5.sample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class T07_NestedTest {

    @Test
    @DisplayName("The very Root test")
    public void rootTest() {

    }

    @Nested
    class SubTests {

        @Test
        public void subTest() {

        }

        @Nested
        class YetAnotherSubTests {

            @Test
            public void subSubTest() {

            }
        }
    }
}
