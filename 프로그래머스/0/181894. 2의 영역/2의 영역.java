import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int from = 0;
        int to = 0;
        
        for(int i=0; i<arr.length; i++){
            
            if(arr[i]==2){
                from=i;
                break;
            }
        }
        
        for(int i=arr.length-1 ; i>0 ; i--){
            
            if(arr[i]==2){
                to=i;
                break;
            }
        }
        
        if(from==to && from==0){
            return new int[]{-1};
        }
        
        int[] answer =Arrays.copyOfRange(arr,from,to+1);
        return answer;
    }
}