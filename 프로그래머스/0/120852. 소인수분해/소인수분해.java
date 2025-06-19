import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        Set<Integer> set = new HashSet<>();
        
        int origin_n = n;
        
        for(int i=2; i<=origin_n; i++){
        
            if(n%i==0){
                set.add(i);
                n=n/i;
                i--;
            }
            
            if(n==1){
                break;
            }
            
            
        }
        
        return set.stream().mapToInt(i -> i).sorted().toArray();
    }
}