package com.zyka.junit5.sample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class T08_ConditionalTest {

    @Test
    @EnabledOnOs(OS.MAC)
    public void testOnMac() {

    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void testOnWindows() {

    }

    @Test
    @EnabledIf(value = {
            "load('nashorn:mozilla_compat.js')",
            "importPackage(java.time)",
            "",
            "var today = LocalDate.now()",
            "var tomorrow = today.plusDays(1)",
            "tomorrow.isAfter(today)"
    },
            engine = "nashorn",
            reason = "Self-fulfilling: {result}")
    public void wildAtHeart() {

    }
}
