package questions.leetcode;
import java.util.HashMap;

public class valid_anagram_242 {
    public static void main(String[] args) {
        System.out.println(method1("anagram","nagaram"));
    }

    public static boolean method1(String s, String t){
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(map.get(c)!=null){
                if(map.get(c)==1){
                    map.remove(c);
                }
                else{
                    map.put(c,map.get(c)-1);
                }
            }
            else{
                return false;
            }
        }
        return map.isEmpty();
    }
}
