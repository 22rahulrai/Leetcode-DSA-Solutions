package questions.leetcode;

import java.util.Arrays;

public class longest_common_prefix_14 {
    public static void main(String[] args) {
        System.out.println(method1(new String[]{"flower","flow","flight"}));
    }

    public static String method1(String[] strs) {
        if (strs == null || strs.length == 0){
            return "";
        }

        Arrays.sort(strs);

        String s1=strs[0];
        String s2=strs[strs.length-1];

        int i=0;

        while(i<s1.length()&& i<s2.length() && s1.charAt(i)==s2.charAt(i)){
            i++;
        }
        return s1.substring(0,i);
    }
}
