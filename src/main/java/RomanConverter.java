import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanConverter {


    private Map<Integer, String> romanByArabicNumbers = new LinkedHashMap<Integer, String>();

    public RomanConverter() {
        romanByArabicNumbers.put(1000, "M");
        romanByArabicNumbers.put(900, "CM");
        romanByArabicNumbers.put(500, "D");
        romanByArabicNumbers.put(400, "CD");
        romanByArabicNumbers.put(100, "C");
        romanByArabicNumbers.put(90, "XC");
        romanByArabicNumbers.put(50, "L");
        romanByArabicNumbers.put(40, "XL");
        romanByArabicNumbers.put(10, "X");
        romanByArabicNumbers.put(9, "IX");
        romanByArabicNumbers.put(5, "V");
        romanByArabicNumbers.put(4, "IV");
        romanByArabicNumbers.put(1, "I");
    }

    public String convert(int arabic) {
        StringBuffer result = new StringBuffer("");

        for (Integer value : romanByArabicNumbers.keySet()) {
            while(arabic >= value) {
                result.append(romanByArabicNumbers.get(value));
                arabic -= value;
            }
        }

        /*arabic = addExactNumber(arabic, result, 1000);
        arabic = addDoubleLetterNumber(arabic, result, 900, 1000);
        arabic = addExactNumber(arabic, result, 500);
        arabic = addDoubleLetterNumber(arabic, result, 400, 500);
        arabic = addExactNumber(arabic, result, 100);
        arabic = addDoubleLetterNumber(arabic, result, 90, 100);
        arabic = addExactNumber(arabic, result, 50);
        arabic = addDoubleLetterNumber(arabic, result, 40, 50);
        arabic = addExactNumber(arabic, result, 10);
        arabic = addDoubleLetterNumber(arabic, result, 9, 10);
        arabic = addExactNumber(arabic, result, 5);
        arabic = addExactNumber(arabic, result, 4);
        addExactNumber(arabic, result, 1);*/

        return result.toString();
    }

//    private int addDoubleLetterNumber(int arabic, StringBuffer result, int exactNumber, int nextNumber) {
//        if (arabic >= exactNumber && arabic < nextNumber) {
//            result.append(romanByArabicNumbers.get(exactNumber));
//            arabic -= exactNumber;
//        }
//        return arabic;
//    }
//
//    private int addExactNumber(int arabic, StringBuffer result, int exactNumber) {
//        while (exactNumber <= arabic) {
//            if (arabic >= exactNumber) {
//                String romanNumber = romanByArabicNumbers.get(exactNumber);
//
//                result.append(romanNumber);
//                arabic -= exactNumber;
//            }
//        }
//
//        return arabic;
//    }


}
