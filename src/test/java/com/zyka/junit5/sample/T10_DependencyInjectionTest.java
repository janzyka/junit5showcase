package com.zyka.junit5.sample;

import com.zyka.junit5.sample.util.RandomParametersExtension;
import com.zyka.junit5.sample.util.RandomParametersExtension.Random;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(RandomParametersExtension.class)
public class T10_DependencyInjectionTest {

    @BeforeEach
    public void init(TestInfo testInfo) {
        System.out.println("Running " + testInfo);
    }

    @RepeatedTest(value = 10)
    public void randomTest(@Random int randomNumber) {
        Assertions.assertTrue(randomNumber < 1);
    }

}
