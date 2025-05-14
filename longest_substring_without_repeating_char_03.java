package questions.leetcode;

import java.util.HashSet;

public class longest_substring_without_repeating_char_03 {
    public static void main(String[] args) {
        System.out.println(method1("abcabcbb"));

    }

    public static int method1(String s) {
        int maxLength = 0;
        int start = 0;
        HashSet<Character> seen = new HashSet<>();

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            while (seen.contains(currentChar)) {
                seen.remove(s.charAt(start));
                start++;
            }
            seen.add(currentChar);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

}
