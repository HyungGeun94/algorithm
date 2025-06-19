import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int answercnt =0;
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i : array){
            
             map.put(i, map.getOrDefault(i, 0) + 1);
            
        }
        
        for(int i : map.keySet()){
            if(map.get(i) > answercnt)  {
                answer=i;
                answercnt=map.get(answer);
            }
        }
        
        int cnt=0;
        for(int i : map.keySet()){
            if(map.get(i)==answercnt){
                cnt++;
            }
        }
        
        return cnt > 1  ? -1 : answer;
    }
}