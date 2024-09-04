import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        
        int[] answer = new int[k];
        
        Arrays.fill(answer,-1);
        
        Set<Integer> set = new HashSet<>();
        
        int index=0;
        
        for(int i=0; i<arr.length; i++){
            
            if(set.size()==k){
                break;
            }
            
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                answer[index++]=arr[i];
                
            }
            
            
        }
        
        return answer;
    }
}