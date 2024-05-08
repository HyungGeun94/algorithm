import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int start, int end_num) {
        List<Integer> list = new ArrayList<>();
        for (int i = end_num; i <=start ; i++) {
            list.add(i);
        }
        
        Collections.reverse(list);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}