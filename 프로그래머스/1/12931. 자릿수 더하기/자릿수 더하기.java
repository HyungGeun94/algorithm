import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String str = n+"";
        for(char c :str.toCharArray()){
            answer+=c-'0';
            
        }


        return answer;
    }
}