import java.util.*;


class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        List<Integer> list = new ArrayList<>();
        
        int[] copyArr1 = Arrays.copyOfRange(arr,intervals[0][0],intervals[0][1]+1);
        int[] copyArr2 = Arrays.copyOfRange(arr,intervals[1][0],intervals[1][1]+1);
        
        int[] answer = new int[copyArr1.length + copyArr2.length];
        
        for(int i=0; i<copyArr1.length; i++){
            answer[i]=copyArr1[i];
        }
        for(int i=0; i<copyArr2.length; i++){
            
            answer[i+copyArr1.length]=copyArr2[i];
        }
        
        
        return answer;
    }
}