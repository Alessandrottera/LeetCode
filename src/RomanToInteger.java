import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String args[]) {
        String s = "DCLXVI";
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt(s));
    }

    public int romanToInt(String s) {

        String[] numbers = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values =     {1000, 900, 500,  400, 100,   90,  50,   40,   10,   9,   5,    4,   1};

        if(s == null || s.length() == 0) {
            return -1;
        }

        StringBuffer sb = new StringBuffer(s);
        int value = 0;

        for(int i = 0; i < numbers.length; i++) {
            String number = numbers[i];

            while(sb.indexOf(number) == 0) {
                value += values[i];
                sb.delete(0, number.length());
            }
        }

        return value;
    }
}
