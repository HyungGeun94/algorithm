import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int k : arr){
            
            for(int i=1; i<=k;i++ ){
                
                list.add(k);   
            }    
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0 ;  i<answer.length; i++){
            
            
            answer[i]=list.get(i);
        }
        
        
        
        
        return answer;
    }
}