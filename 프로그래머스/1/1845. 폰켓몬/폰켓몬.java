import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Set<Integer> set = new HashSet<>();
        
        int maxSelect = nums.length/2;
        
        for(int i : nums){
            set.add(i);
        }
        
        return set.size()>= maxSelect ? maxSelect : set.size();
    }
}