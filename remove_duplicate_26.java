package questions.leetcode;

public class remove_duplicate_26 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(method1(nums));
    }
    public static int method1(int []arr){
        int n=arr.length;
        int j=0;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        return j+1;
    }
}
