import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        
        StringBuffer sb = new StringBuffer();
        
        for(int i=my_string.length()-1; i>=0; i--){
            
            sb.insert(0,my_string.charAt(i));
            answer[my_string.length()-1-i]= sb.toString();
            
        }
        
        
        Arrays.sort(answer);
        
        return answer;
    }
}