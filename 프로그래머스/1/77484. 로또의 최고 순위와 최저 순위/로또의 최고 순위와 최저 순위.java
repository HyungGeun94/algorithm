import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        int matchCount =0;
        int zeroCount = 0 ;
        int[] rank = {6,6,5,4,3,2,1};
        
        for(int i=0; i<lottos.length; i++){
            for(int j=0; j<win_nums.length; j++){
                
                if(lottos[i]==0){
                    zeroCount++;
                    break;
                }
                
                if(lottos[i]==win_nums[j]){
                    matchCount++;
                    break;
                }
                
                
            }
        }
        
            answer[0]=rank[matchCount+zeroCount];
            answer[1]=rank[matchCount];
        
        return answer;
    }
}