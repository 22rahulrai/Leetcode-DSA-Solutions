package questions.leetcode;
import java.util.Arrays;
import java.util.HashSet;

public class Longest_consecutive_sequence_128 {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(STR."better solution\n\{betterSolution(nums)}");
        System.out.println(STR."optimal solution\n\{optimaSolution(nums)}"); // Output: 4
    }

    public static int betterSolution(int[] nums) {
        Arrays.sort(nums);

        int curlen=1,totallen=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]==nums[i-1]+1){
                curlen++;
            }
            else{ //sequence break
                curlen=1;
            }
            totallen=Math.max(totallen,curlen);
        }

        return totallen;
    }

    public static int optimaSolution(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }

        int longest=0;
        for(int e: set){
            if(!set.contains(e-1)){
                int count=1;
                int curr=e;

                while(set.contains(e+1)){
                    e=e+1;
                    count++;
                }
                longest=Math.max(count,longest);
            }
        }
        return longest;
    }
}
