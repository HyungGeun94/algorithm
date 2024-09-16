import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        List<Integer> array = new ArrayList<>();
        
        for (int i = 2; i <= n; i++) {
            
            while (n % i == 0) {
                if (!array.contains(i)) {
                    array.add(i);  
                }
                n /= i;  
            }
        }
        
       
        return array.stream().mapToInt(i -> i).toArray();
    }
}