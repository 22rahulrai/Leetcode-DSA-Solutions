package questions.leetcode;

public class Peak_element_162 {
    public static void main(String[] args) {

    }

    // -----------------  optimal solution  --------------------//
    public static int method1(int[] arr) { // TC = O(log(n))
        int n=arr.length;

        int left=1, right=n-2;

        if(n==1){
            return 0;
        }
        else if(arr[0]>arr[1]){
            return 0;
        }
        else if(arr[n-1]>arr[n-2]){
            return n-1;
        }

        while(left<=right){
            int mid=(right+left)/2;

            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]>arr[mid-1]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
}
