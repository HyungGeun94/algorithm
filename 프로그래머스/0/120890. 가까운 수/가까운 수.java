import java.util.*;


class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        Arrays.sort(array);
        
        int minNum =999999;
        
        for(int i : array){
            
            if(Math.abs(i-n) < minNum){
            minNum = Math.abs(i-n);
            answer=i;
            }
            
            
        }
        
        return answer;
    }
}