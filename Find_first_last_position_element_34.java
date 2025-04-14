package questions.leetcode;

public class Find_first_last_position_element_34 {
    public static void main(String[] args) {
        int [] nums={5,7,7,8,8,10};
        int target=8;
        int arr[]=searchRange(nums,target);
        for(int i:arr){
            System.out.print(STR."\{i} ");
        }
        System.out.println("\nusing two pointer search");
        int res[]=two_pointer_search(nums,target);
        for(int i:arr){
            System.out.print(STR."\{i} ");
        }
    }

    public static int[] two_pointer_search(int []nums,int target){
        int left = 0, right = nums.length - 1;
        int first = -1, last = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                first = mid;
                last = mid;
                while (first > 0 && nums[first - 1] == target) {
                    first--;
                }
                while (last < nums.length - 1 && nums[last + 1] == target) {
                    last++;
                }
                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return new int[]{first, last};
    }

//------------------ Binary search approach ------------------------------//
    public static int[] searchRange(int[] nums, int target) { //O(log(n))
        int n=nums.length;
        int first=findfirst(nums,target,n);
        int last=findlast(nums,target,n);

        return new int[]{first,last};

    }

    public static int findfirst(int[] nums,int target,int n){
        int s=0,e =n-1;
        int first=-1;

        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                first=mid;
                e=mid-1;
            }
            else if(nums[mid]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return first;
    }

    public static int findlast(int[] nums,int target,int n){
        int s=0,e =n-1;
        int last=-1;

        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                last=mid;
                s=mid+1;
            }
            else if(nums[mid]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return last;
    }
}
