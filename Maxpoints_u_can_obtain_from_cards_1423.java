package questions.leetcode;

public class Maxpoints_u_can_obtain_from_cards_1423 {
    public static void main(String[] args) {
        System.out.println(STR."method1 \{method1(new int[]{1, 2, 3, 4, 5, 6, 1}, 3)}"); //12
        System.out.println(STR."method2 \{method2(new int[]{9, 7, 7, 9, 7, 7, 9}, 7)}"); //55
    }

    public static int method1(int[] arr, int k) {
        int n = arr.length;
        int leftsum = 0, rightsum = 0;
        for (int i = 0; i < k; i++) {
            leftsum += arr[i];
        }
        int sum = leftsum;

        for (int c = 1; c <= k; c++) {
            leftsum -= arr[k - c];
            rightsum += arr[n - c];
            sum = Math.max(sum, (rightsum + leftsum));
        }

        return sum;
    }

    public static int method2(int[] arr, int k) {
        int n = arr.length;
        int totalsum = 0;
        for (int i : arr) {
            totalsum += i;
        }
        int windowsize = n - k;
        int windowsum = 0;
        for (int i = 0; i < windowsize; i++) {
            windowsum += arr[i];
        }

        int minsum = windowsum;
        for (int i = windowsize; i < n; i++) {
            windowsum = windowsum + arr[i] - arr[i - windowsize];
            minsum = Math.min(minsum, windowsum);

        }


        return totalsum - minsum;
    }
}
