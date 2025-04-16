package questions.leetcode;

public class Product_arr_expectself_238 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        int[] res = optimalSol2(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] bruteforce_Tle(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int mul = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                mul *= nums[j];
            }
            arr[i] = mul;
        }
        return arr;
    }

    public static int[] bruteforce(int[] nums) {//brute force
        int n = nums.length;
        int[] arr = new int[n];
        int res = 1;
        boolean check = false;
        int pos = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                res = nums[i] * res;
            } else {
                check = true;
                pos = i;
            }
        }

        if (check == true) {
            arr[pos] = res;
            return arr;
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                arr[i] = res / nums[i];
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }

    public static int[] optimalSol(int[] nums) { //optimal solution
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] ans = new int[n];

        prefix[0] = 1;
        suffix[n - 1] = 1;

        // Fill prefix array
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        // Fill suffix array
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        // Calculate the result
        for (int i = 0; i < n; i++) {
            ans[i] = prefix[i] * suffix[i];
        }
        return ans;
    }

    public static int[] optimalSol2(int[] nums) { //optimal solution with O(1)
        int n = nums.length;
        int[] ans = new int[n];

        ans[0] = 1;
        // Calculate prefix products
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int prevSuffix = 1;
        // Calculate suffix products and update ans array
        for (int i = n - 2; i >= 0; i--) {
            prevSuffix *= nums[i + 1];
            ans[i] *= prevSuffix;
        }

        return ans;
    }
}
