import java.util.*;

class Solution {
    public int solution(int[] numbers, int n) {
        
        List<Integer> list = new ArrayList<>();
        
        int sum=0;
        
        for(int i : numbers){
            
            list.add(i);
            
            sum+=i;
            
            if(sum>n){
                break;
            }
            
            
        }
        
        
        
        
        
        return sum;
    }
}
