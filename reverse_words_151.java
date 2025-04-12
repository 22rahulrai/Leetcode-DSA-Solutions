package questions.leetcode;

import java.util.*;

public class reverse_words_151 {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(method2(s));
    }


    public static String method2(String s) {
        String[] words = s.trim().split("\\s+"); // Split by spaces
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }

        return result.toString().trim(); // Trim to remove extra spaces
    }


    public static String method1(String s) {//brute force approach  tc=O(n)
        Stack<String> st = new Stack<>();
        String sp ="";

        for (int i = 0; i <s.length(); i++) {
            if (s.charAt(i) ==' ') {
                st.push(sp);
                sp="";
            } else {
                sp += s.charAt(i);
            }

        }

        if (!sp.isEmpty()) {
            st.push(sp);
        }

        String ans = "";
        while (!st.isEmpty()) {
            ans += st.pop();
            if (!st.isEmpty()) {
                ans += " ";  // Add space between words, but not at the end
            }
        }
        return ans;
    }
}
