package questions.leetcode;

import java.util.*;

public class sumofsquare633 {
    public static void main(String[] args) {
        int n=2147483600;
        System.out.println(sum(n));

    }

        public static boolean sum(int c) {
            int max = (int) Math.floor(Math.sqrt(c));
            int a = 0, b = max;

            while (a <= b) {
                long sum = (long) a * a + (long) b * b;
                if (sum == c) {
                    return true;
                } else if (sum < c) {
                    a++;
                } else {
                    b--;
                }
            }

            return false;
        }

}
