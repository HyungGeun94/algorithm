import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int[] answer = Arrays.copyOf(arr,arr.length);
        
        for(int i=0; i<queries.length; i++){
            
            for(int j=0; j<answer.length; j++){
                
                
                if(queries[i][0]<=j && queries[i][1]>=j){
                    
                    answer[j]+=1;
                }
                
            }
                
                
        }
        
        return answer;
    }
}