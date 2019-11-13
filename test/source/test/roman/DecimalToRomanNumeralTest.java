package test.roman;

import dssc.roman.RomanNumeral;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecimalToRomanNumeralTest {
    @Test
    void zeroIsEmptyString() {
        check(0,"");
    }

    @Test
    void oneIsI() {
        check(1,"I");
    }

    @Test
    void twoIsII() {
        check(2,"II");
    }

    @Test
    void threeIsIII() {
        check(3,"III");
    }

    @Test
    void fourIsIV() {
        check(4,"IV");
    }

    @Test
    void elevenISXI() {
        check(11,"XI");
    }

    private void check(int decimal, String expected) {
        RomanNumeral romanNumeral = new RomanNumeral(decimal);
        assertEquals(expected, romanNumeral.toString());
    }

}

