package questions.leetcode;

public class Buy_sell_stock_121 {
    public static void main(String[] args) {
        int [] arr={7,1,5,3,6,4};
        System.out.println(MaxProfit(arr));
    }

    public static int MaxProfit(int[] arr) {
        int n=arr.length;
        int min=arr[0];
        int res=0;

        for(int i=1;i<n;i++){
            min=Math.min(min,arr[i]);
            res=Math.max(res,arr[i]-min);
        }
        return res;
    }
}
