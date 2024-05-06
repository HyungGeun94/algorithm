import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class Solution {
    public int[] solution(int[] array) {

        List<Integer> list = new ArrayList<>(Arrays.asList(
            Arrays.stream(array).boxed().toArray(Integer[]::new)));
        
        int max = Collections.max(list);

        int index = list.indexOf(max);
                     
        return new int[]{max,index};
    }
}