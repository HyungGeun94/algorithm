import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        
        int [] arr = new int[31];
        
        for(String s : strArr){
            
            arr[s.length()]+=1;
            
            
        }
        
        Arrays.sort(arr);
        
        return arr[arr.length-1];
    }
}