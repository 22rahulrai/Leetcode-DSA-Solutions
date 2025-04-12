package questions.leetcode;

import java.util.*;

public class MajorityElemnt_169 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
//        int[]nums={3,1,3};
        System.out.println(method1(nums));
    }

    public static int method1(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i : map.keySet()) {
            if (map.get(i) > n / 2) {
                return i;
            }
        }
        return -1;
    }


}
