package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class HolimonthsTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/holimonths.csv")
    public void testHolimonthsCalculator(int income, int expenses, int threshold, int expected) {
        Holimonths holimonths = new Holimonths();

        int actual = holimonths.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
