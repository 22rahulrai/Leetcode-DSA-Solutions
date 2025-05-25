package questions.leetcode;

public class rotate_string_796 {
    public static void main(String[] args) {
        System.out.println(method1("abcde","cdeab"));
        System.out.println(STR."\{method2("abcde","cdeab")}");
    }

    public static boolean method1(String s, String goal){ //tc=O(n)
        if(s.length()!=goal.length()){
            return false;
        }

        return (s+s).contains(goal);
    }
    public static boolean method2(String s, String goal){ //tc=O(N^2)
        if(s.length()!=goal.length()){
            return false;
        }
        char []arr=s.toCharArray();

        for(int i=0;i<s.length();i++){
            rotate_byone(arr);
            String rotated=new String(arr);
            if(rotated.equals(goal)){
                return true;
            }
        }
        return false;
    }

    public static void rotate_byone(char[] arr){
        char first=arr[0];

        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;
    }


}
