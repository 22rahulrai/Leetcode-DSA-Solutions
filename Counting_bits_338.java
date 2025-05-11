package questions.leetcode;

public class Counting_bits_338 {
    public static void main(String[] args) {
        int[] arr = method1(5);
        for (int i : arr) {
            System.out.print(STR."\{i} ");
        }
    }

    public static int[] method1(int n) {
        int[] res = new int[n + 1];
        // res[0]=0;res[1]=1;
        for (int i = 0; i <= n; i++) {
            // int num=converttobin(i);
            int count = Integer.bitCount(i); //tc=O(1)
            res[i] = count;
        }
        return res;
    }

    public static int[] method2(int n) {

        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;

    }

    public static int converttobin(int n) {
        String binary = Integer.toBinaryString(n);
        int bin = Integer.parseInt(binary);
        return bin;
    }
}
