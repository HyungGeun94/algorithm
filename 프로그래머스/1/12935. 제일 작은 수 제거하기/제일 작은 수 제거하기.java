import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int min = 2100000000;
        
        
        if(arr.length==1){
            return new int[]{-1}; 
        }else{
            
            for(int i=0; i<arr.length; i++){
                
                if(arr[i]<min){
                    min=arr[i];
                }
            }
            
            
            
            int realmin = min;
            
            return Arrays.stream(arr).filter(number -> number!=realmin).toArray();
            
        }
        
    }
}