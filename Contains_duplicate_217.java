package questions.leetcode;
import java.util.HashSet;
import java.util.HashMap;

public class Contains_duplicate_217 {
    public static void main(String[] args) {
        int [] arr= {1,1,1,3,3,4,3,2,4,2}; //true
        System.out.println(hashmapmethod(arr));
    }

    public static boolean hashsetmethod(int[] nums) {
        HashSet<Integer> set=new HashSet<>();

        for(int n: nums){
            if(set.contains(n)){
                return true;
            }
            set.add(n);
        }
        return false;
    }

    public static boolean hashmapmethod(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int n:arr){
            if(map.containsKey(n) ){
                return true;
            }
            map.put(n,map.getOrDefault(n,0)+1);
        }

        return false;
    }
}
