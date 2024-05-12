import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            
            for(int j=1; j<=i; j++){
                list.add(i);
            }
        }

        int[] newArr = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            newArr[i]=list.get(i);
            
        }

        






        return newArr;
    }
}