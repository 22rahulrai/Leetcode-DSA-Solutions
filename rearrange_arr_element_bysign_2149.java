package questions.leetcode;

import java.util.*;

public class rearrange_arr_element_bysign_2149 {
    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        arr = method2(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] method2(int[] nums) {//optimal
        int n = nums.length;
        int[] temp = new int[n];

        int pi = 0, ni = 1;
        int i = 0;
        while (pi < n || ni < n || i < n) {
            if (nums[i] > 0) {
                temp[pi] = nums[i];
                pi = pi + 2;
            } else {
                temp[ni] = nums[i];
                ni += 2;
            }
            i++;
        }
        return temp;
    }

    public static int[] method1(int[] nums) {//brute force
        int n = nums.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int num : nums) {
            if (num > 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }

        int i = 0, j = 0;
        for (int k = 0; k < n; k++) {
            if (k % 2 == 0) {
                nums[k] = pos.get(i++);
            } else {
                nums[k] = neg.get(j++);
            }
        }
        return nums;
    }
}
