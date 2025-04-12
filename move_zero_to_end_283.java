package questions.leetcode;

public class move_zero_to_end_283 {
    public static void main(String[] args) {
        int nums[]={0,1,0,3,2};
       moveZeroes(nums);

       for(int i:nums){
           System.out.print(i+" ");
       }
    }
    public static void moveZeroes(int[] arr) {
        int n=arr.length;
        // int temp[]=new int[arr.length];
        // int j=0;
        // for(int i=0;i<n;i++){
        //     if(arr[i]!=0){
        //         temp[j++]=arr[i];
        //     }
        // }

        // while(j<n){
        //     temp[j++]=0;
        // }

        // for(int i=0;i<n;i++){
        //     arr[i]=temp[i];
        // }

        int j=0;

        for(int i=1;i<n;i++){
            if(arr[i]!=0){
                arr[i]=arr[i]^arr[j];
                arr[j]=arr[i]^arr[j];
                arr[i]=arr[i]^arr[j];
                j++;
            }
        }
    }
}
