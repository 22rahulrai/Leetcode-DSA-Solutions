package questions.leetcode;

public class min_rotated_sorted_arr_153 {
    public static void main(String[] args) {
        System.out.println(STR." min no in rotated sorted arr: \{method2(new int[]{3,4,5,1,2})}");
        System.out.println(STR." min no in rotated sorted arr: \{method2(new int[]{4,5,6,7,0,1,2})}");

    }

    public static int method1(int[] arr) { //O(n)
        int min=arr[0];
        for(int i:arr){
            if(i<min){
                min=i;
            }
        }
        return min;
    }


    public static int method2(int[] arr) { // O(log(n))
        int n=arr.length;
        int low=0,high=n-1;
        int min=Integer.MAX_VALUE;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[mid]){
                min=Math.min(min,arr[low]);
                low=mid+1;
            }
            else{
                min=Math.min(min,arr[mid]);
                high=mid-1;
            }
        }
        return min;
    }
}
