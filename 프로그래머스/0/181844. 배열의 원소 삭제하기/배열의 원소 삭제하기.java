import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
         List<Integer> list = new ArrayList<>();
        
          for (int i : arr) {
            list.add(i);
            for (int j : delete_list) {
                if(i==j){
                    list.remove(new Integer(i));

                }
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size() ;i ++){
            answer[i]=list.get(i);
            
            
        }
        
        
        return answer;
    }
}