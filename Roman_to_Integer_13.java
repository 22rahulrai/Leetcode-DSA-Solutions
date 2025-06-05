package questions.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Roman_to_Integer_13 {
    public static void main(String[] args) {
        System.out.println(STR."Using method1: \{method1("MCMXCIV")}"); //1994
        System.out.println(STR."Using method2: \{method2("MCMXCIV")}"); //58
    }

    public static int method1(String s) {
        int ans = 0, num = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            if (4 * num < ans)
                ans -= num;
            else
                ans += num;
        }
        return ans;

    }

    public static int method2(String s) {
        int res = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int value = 0;

            // Convert Roman to Integer
            if (ch == 'I') value = 1;
            else if (ch == 'V') value = 5;
            else if (ch == 'X') value = 10;
            else if (ch == 'L') value = 50;
            else if (ch == 'C') value = 100;
            else if (ch == 'D') value = 500;
            else if (ch == 'M') value = 1000;

            // If current value is less than previous, subtract it
            if (value < prevValue) {
                res -= value;
            } else {
                res += value;
            }
            prevValue = value;
        }

        return res;
    }


    public static int romanToInt(String s) {
        // Step 1: Create a Roman numeral to integer map
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int res = 0;
        int prevValue = 0;

        // Step 2: Iterate from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(s.charAt(i));

            if (currentValue < prevValue) {
                res -= currentValue; // Subtract if smaller than the previous
            } else {
                res += currentValue; // Else, add it
            }

            prevValue = currentValue;
        }

        return res;
    }


}
