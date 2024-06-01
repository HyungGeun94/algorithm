import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        
        int[] answer = new int[prices.length];
        
        Arrays.fill(answer,1);
        
        answer[prices.length-1] = 0;
        
        int time=0;
        
        for(int i=0; i<prices.length-1; i++){
            
            for(int j=i+1; j<prices.length; j++){
                
                if(prices[i]<=prices[j]){
                   time++; 
                    if(j==prices.length-1){
                        answer[i]=time;
                    }
                }else{
                    answer[i]=time+1;
                    break;
                }
                
            }
            
            time=0;
        }
        
        
        
        return answer;
    }
}