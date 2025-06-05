import java.util.stream.IntStream;
import java.util.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        int size1 = arr1.length;
        int size2 = arr2.length;
        
        if(size1 != size2){
            answer = size2 > size1 ? -1 : 1;
            
        }else{
            
            int sum1 = Arrays.stream(arr1).sum();
            int sum2 = Arrays.stream(arr2).sum();
            
            answer= sum1 == sum2 ? 0 : sum1>sum2 ? 1 : -1;
            
            
            
        }
        
        
        
        return answer;
    }
}