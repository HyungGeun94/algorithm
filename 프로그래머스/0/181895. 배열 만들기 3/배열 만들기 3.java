import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        
        
        int x1 = intervals[0][0];
        int x2 = intervals[0][1];
        
        int y1 = intervals[1][0];
        int y2 = intervals[1][1];
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=x1; i<=x2; i++){
            list.add(arr[i]);
        }
        
        for(int i=y1; i<=y2; i++){
            list.add(arr[i]);
        }
            
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}