package questions.leetcode;

import java.util.HashMap;

public class subarr_sum_equals_k_560 {
    public static void main(String[] args) {
        System.out.println(STR."using method1 \n \{method1(new int[]{1,1,1},2)}   \ntc=O(n^2) ");
        System.out.println(STR."using method2 \n \{method2(new int[]{3,1,2,4},6)}   \nTC=0(n)");
    }

    // ----------------------  better solution  ---------------------------------------//
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

    // ----------------------------------    Optimal solution  ------------------------------//
    public static int method2(int []arr, int k){ // Tc = 0(n)  SPace= o(n)
        int n=arr.length;
        int sum=0, count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);

        for (int j : arr) {
            sum += j;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
