import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            
            int num = arr[i];
            
            for (int j = 0; j < num; j++) {
                list.add(num);
            }
            
        }
        
        return list.stream().mapToInt(num -> num).toArray();
    }
}