package questions.leetcode;

public class sort_arr_of_0_1_2___75 {
    public static void main(String[] args) {
//        int []arr={2,0,2,1,1,0};
        int []arr={1,2};
        method1(arr);
        print(arr);
    }

    public static void method1(int []arr){
        int n=arr.length;
        int c0=0,c1=0,c2=0;

        for(int i=0;i<n;i++){
            if(arr[i]==0){
                c0++;
            }
            if(arr[i]==1){
                c1++;
            }
            if(arr[i]==2){
                c2++;
            }
        }

        int i=0;

        for(i=0;i<c0;i++){
            arr[i]=0;
        }
        for(i=c0;i<c0+c1;i++){
            arr[i]=1;
        }
        for(i=c0+c1;i<c0+c1+c2;i++){
            arr[i]=2;
        }
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
