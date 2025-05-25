package questions.leetcode;

import java.util.HashMap;

public class Single_no_136 {
    public static void main(String[] args) {
        System.out.println(STR."using method1 \{method1(new int[]{4,1,2,1,2})}");
        System.out.println(STR."using method2 \{method1(new int[]{4,1,2,1,2})}");
    }
     public static int method1(int[] nums) {
         HashMap<Integer,Integer> map=new HashMap<>();

         for(int a:nums){
             map.put(a,map.getOrDefault(a,0)+1);
         }

         for(int a:map.keySet()){
             if(map.get(a)==1){
                 return a;
             }
         }
         return -1;
     }

    public static int method2(int[] arr) {
        int x=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            x=x^arr[i];
        }
        return x;
    }
}
