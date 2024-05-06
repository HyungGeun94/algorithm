import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] num_list, int n) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i : num_list){
            list.add(i);
        }
        
        Collections.rotate(list,list.size()-n);
        
        
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}