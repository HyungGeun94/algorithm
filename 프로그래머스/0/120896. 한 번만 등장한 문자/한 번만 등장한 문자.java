import java.util.*;

class Solution {
    public String solution(String s) {
        
     String answer = "";


        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){

            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

        }

        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        for (int i=0; i<list.size(); i++) {

            if(map.get(list.get(i))==1){
                answer+=list.get(i);

            }

        }
        
        return answer;
      
    }
}