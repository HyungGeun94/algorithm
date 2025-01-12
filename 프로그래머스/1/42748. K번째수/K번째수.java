import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int[] arr = null;
        
        for(int i=0; i<commands.length; i++){
            
                arr = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
                
                Arrays.sort(arr);
                
                answer[i]=arr[commands[i][2]-1];
                
            
        }
        
        
        
        return answer;
    }
}