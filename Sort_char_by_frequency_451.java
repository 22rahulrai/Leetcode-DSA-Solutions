package questions.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Sort_char_by_frequency_451 {
    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
        System.out.println(frequencySort("Aabb"));

    }

        public static String frequencySort(String s) {
            HashMap<Character,Integer> map=new HashMap<>();

            // putting each char in map with its frequency
            for(char c:s.toCharArray()){
                map.put(c,map.getOrDefault(c,0)+1);
            }

            //created a list of char put char from the map into it
            List<Character> list=new ArrayList<>(map.keySet());

            // sorted the list based on values of map keys
            //1. Positive if ch2 has a higher value than ch1, meaning ch2 should come before ch1.
            //2. Negative if ch2 has a lower value, meaning ch1 should come before ch2.
            //3. Zero if both have the same value, indicating no change in order.
            list.sort((c1,c2) -> map.get(c2) - map.get(c1));

            StringBuilder res=new StringBuilder();

            for(char c:list){ //it will get char
                for(int i=0;i<map.get(c);i++){ // it will till char value(count)
                    res.append(c);
                }
            }
            return res.toString();
        }
}
