import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        
        
        for(int i=0; i<want.length; i++){
            
            map1.put(want[i],number[i]);
            
        }
        
        for(int i=0; i<discount.length-10+1 ; i++){
            for(int j=i; j<i+10; j++){
                
                if(map2.containsKey(discount[j])){
                    
                    map2.put(discount[j],map2.get(discount[j])+1);
                }else{
                    
                    map2.put(discount[j],1);
                    
                }
                
            }
            
            if(map2.equals(map1)){
                answer++;
            }
            map2 = new HashMap<>();
        }
        
        
        
        return answer;
    }
}