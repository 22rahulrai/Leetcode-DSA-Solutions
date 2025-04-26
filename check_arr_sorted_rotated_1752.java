package questions.leetcode;

public class check_arr_sorted_rotated_1752 {
    public static void main(String[] args) {
//        int []arr={3,4,5,1,2}; // true
        int []arr={2,1,3,4};  // false
        System.out.println(check(arr));
    }

    public static boolean check(int [] arr){
        int n=arr.length;
        int c=0;

        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                c++;
            }
        }

        if(arr[n-1]>arr[0]){
            c++;
        }
        return c<=1;
    }
}
