package com.zyka.junit5.sample;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class T06_ParametersTest {

    @ParameterizedTest(name = "{index} => First name=''{0}''")
    @ValueSource(strings = {"Pavel", "Pepa"})
    public void testWithParameters(String value) {
        assertTrue(value.toLowerCase().contains("pa"));
    }

    @ParameterizedTest(name = "{index} => Dude=''{0}''")
    @MethodSource("dudes")
    public void testWithSupplierParameters(Dude dude) {
        assertTrue(dude.getFirstName().toLowerCase().contains("pa"));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/test.csv")
    public void testWithCsv(String string, int integer) {

    }

    private static Stream<Dude> dudes() {
        return Stream.of(new Dude("Pepa"), new Dude("Pavel"));
    }

    static class Dude {
        private final String firstName;

        public Dude(String firstName) {
            this.firstName = firstName;
        }

        public String getFirstName() {
            return firstName;
        }

        @Override
        public String toString() {
            return "Dude{" +
                    "firstName='" + firstName + '\'' +
                    '}';
        }
    }
}
