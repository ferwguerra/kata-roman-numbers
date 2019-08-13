import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RomanConverter {


    private Map<Integer, String> romanByArabicNumbers = new HashMap<Integer, String>();

    public RomanConverter() {
        romanByArabicNumbers.put(1, "I");
        romanByArabicNumbers.put(4, "IV");
        romanByArabicNumbers.put(5, "V");
        romanByArabicNumbers.put(9, "IX");
        romanByArabicNumbers.put(10, "X");
    }

    public String convert(int arabic) {
        StringBuffer result = new StringBuffer("");

        while (1000 <= arabic) {
            result.append("M");
            arabic -= 1000;
        }

        if (arabic >= 900 && arabic < 1000) {
            result.append("CM");
            arabic -= 900;
        }

        if (arabic >= 500) {
            result.append("D");
            arabic -= 500;
        }

        if (arabic >= 400 && arabic < 500) {
            result.append("CD");
            arabic -= 400;
        }

        while (100 <= arabic) {
            result.append("C");
            arabic -= 100;
        }

        if (arabic >= 90 && arabic < 100) {
            result.append("XC");
            arabic -= 90;
        }

        if (arabic >= 50) {
            result.append("L");
            arabic -= 50;
        }

        if (arabic >= 40 && arabic < 50) {
            result.append("XL");
            arabic -= 40;
        }

        while (10 <= arabic) {
            arabic = addExactNumber(arabic, result, 10);
        }

        arabic = addExactNumber(arabic, result, 9);

        arabic = addExactNumber(arabic, result, 5);

        arabic = addExactNumber(arabic, result, 4);

        while (1 <= arabic) {
            arabic = addExactNumber(arabic, result, 1);
        }

        return result.toString();
    }

    private int addExactNumber(int arabic, StringBuffer result, int exactNumber) {
        String romanNumber = romanByArabicNumbers.get(exactNumber);
        if (arabic >= exactNumber) {
            result.append(romanNumber);
            arabic -= exactNumber;
        }
        return arabic;
    }


}
