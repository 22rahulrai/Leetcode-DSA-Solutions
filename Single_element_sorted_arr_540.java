package questions.leetcode;

public class Single_element_sorted_arr_540 {
    public static void main(String[] args) {
        System.out.println(STR."\{m1_Binarysearch(new int[]{1,1,2,3,3,4,4,8,8})}");
        System.out.println(STR."\{m1_Binarysearch(new int[]{3,3,7,7,10,11,11})}");

        System.out.println(STR."\{method2(new int[]{1,1,2,3,3,4,4,8,8})}");
        System.out.println(STR."\{method2(new int[]{3,3,7,7,10,11,11})}");
    }

    public static int m1_Binarysearch(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return arr[0];
        }
        if (arr[0] != arr[1]) {
            return arr[0];
        }
        if (arr[n - 1] != arr[n - 2]) {
            return arr[n - 1];
        }

        int low = 1, high = n - 2;

        while (low < high) {
            int mid = (low + high) / 2;

            if ((arr[mid] != arr[mid - 1]) && (arr[mid] != arr[mid + 1])) {
                return arr[mid];
            } else if ( (mid % 2 == 0 && arr[mid] == arr[mid + 1]) || (mid % 2 == 1 && arr[mid] == arr[mid - 1]) ) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int method2(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            // Make sure mid is even
            if (mid % 2 == 1) {
                mid--;
            }
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2; // Unique element is on the right
            } else {
                right = mid; // Unique element is on the left or at mid
            }
        }
        return nums[left];
    }

}
