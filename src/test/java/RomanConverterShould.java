import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class RomanConverterShould {

    @Test
    @Parameters({
            "1, I",
            "2, II",
            "5, V",
            "6, VI",
            "7, VII",
            "10, X",
            "13, XIII",
            "15, XV",
            "16, XVI",
            "20, XX",
            "21, XXI",
            "25, XXV",
            "51, LI",
            "55, LV",
            "65, LXV",
            "88, LXXXVIII",
            "188, CLXXXVIII",
            "888, DCCCLXXXVIII",
            "3888, MMMDCCCLXXXVIII",

            "4, IV",
            "9, IX",
            "14, XIV",
            "34, XXXIV",
            "40, XL",
            "43, XLIII",
            "93, XCIII",
            "493, CDXCIII",
            "993, CMXCIII",
    })
    public void convert(int arabic, String roman) {
        RomanConverter romanConverter = new RomanConverter();
        assertEquals(roman, romanConverter.convert(arabic));
    }
}
