package no.thomaswaaler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/* Acceptance criteria:
 * [x] Is leap year when
 *      [x] Year is divisible by 4 and NOT 100
 *      [x] Year is divisible by 400
 *
 * [x] Is NOT leap year when
 *      [x] Year is NOT divisible by 4
 *      [x] Year is divisible by 100 and NOT 400
*/

public class Calendar_Tests {
    @ParameterizedTest
    @MethodSource("years_4_not_100")
    public void Leap_Year_If_Divisible_By_4_And_Not_100(boolean expected, int input) {
        Assertions.assertEquals(expected, GregorianCalendar.isLeapYear(input));
    }

    public static Stream years_4_not_100() {
        return Stream.of(
                Arguments.of(true, 1992),
                Arguments.of(true, 1988),
                Arguments.of(false, 1900),
                Arguments.of(false, 1800)
        );
    }

    @Test
    public void Leap_Year_2000_Is_Divisible_By_400() {
        Assertions.assertTrue(GregorianCalendar.isLeapYear(2000));
    }

    @ParameterizedTest
    @MethodSource("years_not_4")
    public void Not_Leap_Year_If_Not_Divisible_By_4(boolean expected, int input) {
        Assertions.assertEquals(expected, GregorianCalendar.isLeapYear(input));
    }

    public static Stream years_not_4() {
        return Stream.of(
                Arguments.of(false, 1814),
                Arguments.of(false, 1939),
                Arguments.of(true, 1940),
                Arguments.of(true, 1984)
        );
    }

    @ParameterizedTest
    @MethodSource("years_100_not_400")
    public void Not_Leap_Year_If_Divisible_By_100_And_Not_400(boolean expected, int input) {
        Assertions.assertEquals(expected, GregorianCalendar.isLeapYear(input));
    }

    public static Stream years_100_not_400() {
        return Stream.of(
                Arguments.of(false, 1700),
                Arguments.of(false, 2100),
                Arguments.of(true, 2400),
                Arguments.of(true, 1600)
        );
    }
}
