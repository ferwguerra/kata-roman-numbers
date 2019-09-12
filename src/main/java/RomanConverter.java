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
        StringBuffer result = new StringBuffer();

        for (Integer value : romanByArabicNumbers.keySet()) {
            while(arabic >= value) {
                result.append(romanByArabicNumbers.get(value));
                arabic -= value;
            }
        }

        return result.toString();
    }

}
