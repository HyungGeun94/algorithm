import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int[] divisorArr = Arrays.stream(arr).filter(i-> i%divisor==0).sorted().toArray();
        
      
        return divisorArr.length!=0 ? divisorArr : new int[]{-1}; 
    }
}