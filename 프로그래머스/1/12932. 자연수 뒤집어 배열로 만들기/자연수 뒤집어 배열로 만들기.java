import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;


class Solution {
    public int[] solution(long n) {
        
        String str = n+"";

        int idx =0;
        
        int[] answer = new int[str.length()];
        
        for(int i=str.length()-1; i>=0; i--){
            
            answer[idx++]=str.charAt(i)-'0';
            
        }
        
        
        return answer;
    }
}