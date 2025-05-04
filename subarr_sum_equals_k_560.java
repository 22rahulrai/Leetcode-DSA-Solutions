package questions.leetcode;

public class subarr_sum_equals_k_560 {
    public static void main(String[] args) {
        System.out.println(STR."using method1 tc=O(n^2)  \{method1(new int[]{1,2,1,2,1},3)}");
        System.out.println(STR."\{method1(new int[]{1,2,3},3)}");
    }

    public static int method1(int[] nums, int t) { // O(n^2)
        int n = nums.length;
        int c = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == t) {
                    c++;
                }
            }
        }
        return c;
    }
}
