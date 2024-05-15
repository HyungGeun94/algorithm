import java.util.*;


class Solution {
    public String solution(String s) {

        String answer = "";
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }
            else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }


        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if(entry.getValue()==1){
                answer += entry.getKey();
            }
        }
        
        char[] chArr = answer.toCharArray();
        Arrays.sort(chArr);
        
        return new String(chArr);

    }
}