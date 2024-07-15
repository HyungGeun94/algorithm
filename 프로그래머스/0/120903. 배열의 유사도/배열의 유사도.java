import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        List<String> list = new ArrayList<>();
        
        for(String str : s1){
            
            list.add(str);
        }
        
        for(String str : s2){
            
            if(list.contains(str)){
                answer++;
            }
        }
        
        
        
        return answer;
    }
}