import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for (int size : tangerine) {
            countMap.put(size, countMap.getOrDefault(size, 0) + 1);
        }
        
        List<Integer> countList = new ArrayList<>(countMap.values());
        countList.sort(Collections.reverseOrder());
        
        int totalTangerines = 0; 
        int kindCount = 0;       
        
        for (int count : countList) {
            totalTangerines += count;  
            kindCount++;               
            if (totalTangerines >= k) { 
                break;
            }
        }
        
        return kindCount; 
    }
}