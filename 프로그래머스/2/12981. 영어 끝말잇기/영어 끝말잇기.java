import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
         
        int[] answer = new int[2];
        
        Map<String,Integer> map = new HashMap<>();
        
        map.put(words[0],0);

        
        for(int i=1; i<words.length; i++){
            
            if(map.containsKey(words[i]) || words[i-1].charAt(words[i-1].length()-1)!=words[i].charAt(0))
            {
                answer[0]=(i+1)%n==0 ? n: (i+1)%n;
                answer[1]=(i+1)/n + ((i+1)%n==0 ? 0 : 1);
                
            break;
                
            }
            else{
                map.put(words[i],i);

            }
            
        }
        

        
        
        

        return answer;
    }
}