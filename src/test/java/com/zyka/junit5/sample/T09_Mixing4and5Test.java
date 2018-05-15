package com.zyka.junit5.sample;

// Junit4
import org.junit.Before;
import org.junit.Ignore;

// Junit 5
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class T09_Mixing4and5Test {

    @Before
    public void initJunit4() {
        System.out.println("Junit4");
    }

    @BeforeEach
    public void initJunit5() {
        System.out.println("Junit5");
    }

    @Test
    @Disabled
    public void junit5test() {

    }

    @Ignore
    @org.junit.Test
    public void junit4Test() {

    }
}
