import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        
        Arrays.fill(answer,-1);
        
        Set<Integer> set = new HashSet<>();
        int idx = 0 ;
        for(int i : arr ){
            
            if(!set.contains(i) && idx<k){
                set.add(i);
                answer[idx++]=i;
            }
            
            
        }
        
        return answer;
    }
}