import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
         List<Integer> valid = new ArrayList<>();
    
    for (int i = 0; i < rank.length; i++) {
        if (attendance[i]) {
            valid.add(i); 
        }
    }

    valid.sort(Comparator.comparingInt(i -> rank[i])); 

    int a = valid.get(0), b = valid.get(1), c = valid.get(2);
    return 10000 * a + 100 * b + c;
    }
}
