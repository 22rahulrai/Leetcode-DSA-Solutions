package questions.leetcode;

public class sumof_two_int_375 {
    public static void main(String[] args) {
        System.out.println(STR."Sum: \{method1(2,3)}");
    }
    public static int method1(int a,int b){
        int c;
        while(b!=0){
            // carry contains common set bits of a and b
            c=(a&b);
            // Sum of bits of a and b where at least one of the bits is not set
            a=a^b;
            // Carry is shifted by one so that adding it to a gives the required sum
            b=(c)<<1;
        }
        return a;
    }
}
