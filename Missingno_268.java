package questions.leetcode;

public class Missingno_268 {
    public static void main(String[] args) {
        System.out.println(STR."using method1 \{method1(new int[]{3, 0, 1})}");
        System.out.println(STR."using method2 \{method1(new int[]{9,6,4,2,3,5,7,0,1})}");
    }

    public static int method1(int[] arr) {
        int n = arr.length;
        int xor = 0;

        for (int i = 0; i <= n; i++) {
            xor = xor ^ i;
        }
        System.out.println(STR."size of arr \{n} and xor of i to n: \{xor}");
        for (int i : arr) {
            xor = xor ^ i;
        }

        return xor;
    }

    public static int method2(int[] arr) {
        int n = arr.length;
        int expectedsum = (n * (n + 1)) / 2;
        int actualsum = 0;

        for (int j : arr) {
            actualsum += j;
        }
        return expectedsum - actualsum;
    }
}
