package questions.leetcode;

public class String_Integer_atoi_8 {
    public static void main(String[] args) {
        System.out.println(STR."using method1 \{method1("-42")}");
        System.out.println(STR."using method1 \{method1("-91283472332")}");

    }

    public static int method1(String s) {
        s=s.trim(); //removing extra space
        int n=s.length();

        if(n==0){ // if string length is 0;
            return 0;
        }
        int i=0;
        int sign=1;
        // to check if no is + or -
        if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else if(s.charAt(i)=='+'){
            i++;
        }

        int res=0;

        while(i<n){
            char c=s.charAt(i);
            //if no is not between 0 - 9
            if(c<'0' || c>'9'){
                break;
            }

            int digit=c-'0';
            // if no is greater than integer.max
            if (res > (Integer.MAX_VALUE - digit) / 10) {
                // if sign is 1     return max      or else min
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            res=res*10+digit;
            i++;
        }
        return res*sign;
    }


}
