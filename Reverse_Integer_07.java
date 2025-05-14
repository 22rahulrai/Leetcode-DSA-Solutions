package questions.leetcode;

public class Reverse_Integer_07 {
    public static void main(String[] args) {
        System.out.println(method1(123));
        System.out.println(method1(1534236469));
    }

    public static int method1(int n){
        int reverse=0;

        while(n!=0){
            int rem=n%10;
            n=n/10;
            if(reverse>Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE / 10 && rem > 7) ){
                return 0;
            }
            if(reverse<Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE / 10 && rem < -8) ){
                return 0;
            }
            reverse=reverse*10+rem;
        }
        return reverse;
    }

    public static int method2(int n){
        int res=0;
        boolean isneg= n<0;
        String st=String.valueOf(Math.abs(n));
        StringBuilder sb=new StringBuilder(st).reverse();

        try{
            res=Integer.parseInt(sb.toString());
        }
        catch(NumberFormatException e){
            return 0;
        }

        return isneg ? -res :res ;
    }


}
