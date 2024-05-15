import java.util.*;


class Solution {
    public int solution(String[] strArr) {
        
        Map<Integer,Integer> map = new HashMap<>();


        for (String s : strArr) {
            
            if (map.containsKey(s.length())) {
                
                map.put(s.length(), map.get(s.length()) + 1);
            } 
            else {
                
                map.put(s.length(), 1);
            }
        }

        Object[] array = map.values().toArray();
        Arrays.sort(array);

       return (int)array[array.length-1];
    }
}