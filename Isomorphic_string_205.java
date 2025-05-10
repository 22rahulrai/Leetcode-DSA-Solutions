package questions.leetcode;

import java.util.HashMap;

public class Isomorphic_string_205 {
    public static void main(String[] args) {
        System.out.println(method1("egg","add"));
        System.out.println(method2("ab","cc"));
        System.out.println(method2("egg","add"));

    }

    public static boolean method1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character,Character> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char cs=s.charAt(i);
            char ct=t.charAt(i);

            if(map.containsKey(cs)){
                if(map.get(cs)!=ct){
                    return false;
                }
            }
            else if(map.containsValue(ct)){
                return false;
            }
            map.put(cs,ct);

        }
        return true;
    }

    public static boolean method2(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            if (mapST.containsKey(chS)) {
                if (mapST.get(chS) != chT)
                    return false;
            } else {
                if (mapTS.containsKey(chT))
                    return false;

                mapST.put(chS, chT);
                mapTS.put(chT, chS);
            }
        }
        return true;
    }
    
}
