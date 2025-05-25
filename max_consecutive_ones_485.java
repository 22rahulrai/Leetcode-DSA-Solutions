package questions.leetcode;

public class max_consecutive_ones_485 {
    public static void main(String[] args) {
        System.out.println(STR."using method1: \{method1(new int[]{1,1,0,1,1,1})}");
    }

    public static int method1(int[] arr) {
        int n = arr.length;
        int c = 0;
        int max = 0;

        for (int j = 0; j < n; j++) {
            if (arr[j] == 1) {
                c++;
            } else {
                c=0;
            }

            max = Math.max(max, c);
        }

        return max;
    }
}
