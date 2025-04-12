package questions.leetcode;

public class Maximum_subarray_53 {
    public static int maxSubarr(int [] nums){
        int n=nums.length;
        int maxsum=Integer.MIN_VALUE;
        int cursum=0;
        for(int i=0;i<n;i++){
            cursum+=nums[i];
            if(cursum> maxsum){
                maxsum=cursum;
            }
            if(cursum<0){
                cursum=0;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int [] arr={-2,1,-3,4,-1,2,1,-5,4};

        System.out.println("max sum of subarr: "+maxSubarr(arr));
    }
}
