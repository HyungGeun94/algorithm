import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        Set<Integer> set = new HashSet<>();
        
        
        
        for(int i=0; i<numbers.length-1; i++){
            
            for(int j=i+1; j<numbers.length; j++){
                
                set.add(numbers[i]+numbers[j]);
                
                
            }
            
        }
        
        List<Integer> list = new ArrayList<>(set);
        
        Collections.sort(list);
        
        
        int[] answer = new int[set.size()];
        
        for(int i=0; i<answer.length; i++){
            
            answer[i]=list.get(i);
            
        }
        
        
        
        return answer;
    }
}