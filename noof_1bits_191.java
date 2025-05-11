package questions.leetcode;

public class noof_1bits_191 {
    public static void main(String[] args) {
        System.out.println(method2(11));  //3
    }

    public static int method1(int n) { //O(1) — Constant time
        int k = Integer.bitCount(n);
        return k;
    }

    public static int method3(int n){ // this method is good  O(log n)
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;  // Right shift n by 1
        }
        return count;
    }
    public static int method2(int n){
        int res = 0;
        for (int i = 0; i < 32; i++) {
            System.out.print(n>>i );
            if (((n >> i) & 1) == 1) {
                res += 1;
            }
        }
        return res;
    }
}
