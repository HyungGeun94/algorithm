import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        
        char[] chArr1 = before.toCharArray();
        char[] chArr2 = after.toCharArray();
        
        Arrays.sort(chArr1);
        Arrays.sort(chArr2);
        
        if(Arrays.equals(chArr1,chArr2)){
            
            answer=1;
        }
            
        
        return answer;
    }
}