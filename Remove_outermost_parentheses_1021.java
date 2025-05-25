package questions.leetcode;

public class Remove_outermost_parentheses_1021 {
    public static void main(String[] args) {
        System.out.println(STR."\{method1("(((((((((())))))))))")}");
        System.out.println(STR."\{method2("(()())(())")}");

    }

    // Brute force approach
    public static String method1(String s){ // o(n^2)
        StringBuilder st=new StringBuilder();
        int blanced=0;
        int start=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                blanced++;
            }
            else{
                blanced--;
            }
            if(blanced==0){
                st.append(s.substring(start+1,i)); //because of this substring( TC = O(i-start+1) == O(n) )
                start=i+1;
            }
        }
        return st.toString();
    }

    public static String method2(String s){ // o(n)
        StringBuilder st=new StringBuilder();
        int blanced=0;
        int start=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                blanced++;
            }
            else{
                blanced--;
            }
            if(blanced==0){
                st.append(s, start+1, i);  //this method does't take time complexmity
                start=i+1;
            }
        }
        return st.toString();
    }

    //Better
    public static String method3(String s){ // O(n)
        StringBuilder st=new StringBuilder();
        int blanced=0;
        int start=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                blanced--;
            }

            if(blanced!=0){
                st.append(s.charAt(i));
            }
            if(s.charAt(i)=='('){
                blanced++;
            }
        }
        return st.toString();
    }
}
