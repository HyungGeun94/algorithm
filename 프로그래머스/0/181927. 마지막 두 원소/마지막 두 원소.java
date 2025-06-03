import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        
        for(int i=0; i<num_list.length; i++){
            answer[i]=num_list[i];
        }
        
        int lastNum = num_list[num_list.length-2];
        int lastlastNum = num_list[num_list.length-1];
        
        if(lastlastNum > lastNum ){
            
            answer[answer.length-1] = lastlastNum-lastNum;
            
        }else{
            answer[answer.length-1] = lastlastNum *2;
        }
        
        
        
        return answer;
    }
}