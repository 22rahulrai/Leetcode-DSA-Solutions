package questions.leetcode;

public class rotate_arr_189 {
    public static void main(String[] args) {
        //testcase 1
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        method3(arr, k);
        print(arr);
    }


    public static void method1(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static void method2(int[] nums, int k) {//brute force approach and it gives tle
        int n = nums.length;
        int j = 0;
        while (j <= k) {
            int x = nums[0];
            for (int i = 0; i < n - 1; i++) {
                nums[i] = nums[i + 1];
            }
            nums[n - 1] = x;
            j++;
        }
    }

    public static void method3(int[] arr, int k) {//brute force approach and it gives tle
        int n=arr.length;
        int []temp=new int[n];

        k=k%n;
        for(int i=0;i<n;i++){
            temp[(i+k)%7]=arr[i];
        }

        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }




    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
