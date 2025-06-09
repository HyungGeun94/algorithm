import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        Arrays.sort(array);
        
        int min = 99999;
        
        for(int i=0; i<array.length; i++){
            
            if(Math.abs(array[i]-n)<min){
                
                answer=array[i];
                min = Math.abs(array[i]-n);
            }
            
        }
        
        return answer;
    }
}