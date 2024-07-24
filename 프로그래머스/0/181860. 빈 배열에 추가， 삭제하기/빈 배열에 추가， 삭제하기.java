import java.util.*;


class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<flag.length; i++){
            
            if(flag[i]){
                
                for(int k=0; k<arr[i]*2; k++){
                    
                    list.add(arr[i]);
                }
                
                
            }else{
                
                int idx = list.size()-1;
                
                for(int j=0; j<arr[i]; j++){
                    
                    list.remove(idx--);
                    
                }
                
                
            }
            
            
        }
        
        
        
        
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            
            answer[i]=list.get(i);
        }
        
        return answer;
    }
}