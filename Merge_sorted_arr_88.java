package questions.leetcode;

import java.util.Arrays;

public class Merge_sorted_arr_88 {
    public static void main(String[] args) {
        int[] nums1 = new int[6];  // Total length = m + n = 3 + 3 = 6
        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 3;
        // nums1[3] to nums1[5] are 0s by default

        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;

        method2(nums1, m, nums2, n);

        System.out.println(STR."Merged array: \{Arrays.toString(nums1)}");
    }


    public static void method1(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }

    public static void method2(int[] nums1, int m, int[] nums2, int n){
        int i = m-1, j = n-1;
        // start from the end
        for (int k = m+n-1; k >=0; k--) {
            // the latter pointer reaches the start. It's done
            if (j < 0) {
                break;
            }

            // each time put the largest value between 2 arrays to the end
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i--];
            } else {
                nums1[k] = nums2[j--];
            }
        }

    }
}
