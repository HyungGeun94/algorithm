import java.util.*;


class Solution {
    public int solution(int[] array, int n) {
        int minus = 10000;
        
        int answer = 0;
        
        Arrays.sort(array);
        
        for(int i=0; i<array.length; i++){
            
            if( Math.abs(n-array[i]) < minus ){
                
                minus = Math.abs(n-array[i]);
                answer=array[i];
            }
            
        }
        
        return answer;
    }
}