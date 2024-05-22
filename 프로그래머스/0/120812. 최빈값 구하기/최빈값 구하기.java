import java.util.*;

class Solution {
    public int solution(int[] array) {
        int maxFrequency = 0;
        int answer = -1;
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();
            
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                answer = num;
            } else if (frequency == maxFrequency) {
                answer = -1;
            }
        }
        
        return answer;
    }
}
