package no.thomaswaaler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/* Acceptance criteria:
 * [ ] Is leap year when
 *      [x] Year is divisible by 4
 *      [ ] Year is divisible by 4 and NOT 100
 *      [ ] Year is divisible by 400
 *
 * [ ] Is NOT leap year when
 *      [X] Year is NOT divisible by 4
 *      [ ] Year is divisible by 100
 *      [ ] Year is divisible by 100 and NOT 400
 *
 * [ ] Is leap year when year divisible by 4
 * [ ] Is NOT leap year when year NOT divisible by 4
 * [ ] Is NOT leap year when year divisible by 4 and 100
 * [ ] Is leap year when year divisible by 400
 * [ ] Is NOT leap year when year divisible by 100 and NOT 400
*/

public class Calendar_Tests {
    @Test
    public void Leap_Year_96_Is_Divisible_By_4() {
        Assertions.assertTrue(GregorianCalendar.isLeapYear(96));
    }

    @Test
    public void Year_98_Is_Not_Divisible_By_4() {
        Assertions.assertFalse(GregorianCalendar.isLeapYear(98));
    }
}
