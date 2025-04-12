package questions.leetcode;

import java.sql.SQLOutput;

public class valid_palindrome125 {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", ""); // removing all character other than a-b,0-9
        boolean res = plan2(s);
        return res;
    }
    public static boolean plan2(String s){
        int st=0;
        int n=s.length();
        int l=n-1;

        while(st<l){
            if(s.charAt(st)!=s.charAt(l)){
                return false;
            }
            st++;
            l--;

        }
        return true;
    }



    public static boolean plan(int i,String s){
        if(i>=s.length()/2){//base case
            return true;
        }

        if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            return false;
        }

        return plan(i+1,s);
    }
}
