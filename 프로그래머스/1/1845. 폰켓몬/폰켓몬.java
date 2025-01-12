import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int max = nums.length/2;
        
        Set<Integer> set = new HashSet<>();
        
        for(int i : nums){
            
            set.add(i);
        }
        
        
        
        return set.size()>=max ? max : set.size();
    }
}