import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        List<Integer> list = new ArrayList<>();
        for (int num : num_list) {
            list.add(num);
        }
        
        Collections.reverse(list);
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
