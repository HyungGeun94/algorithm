import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(int[] topping) {
        int n = topping.length;
        int[] leftCount = new int[n];
        int[] rightCount = new int[n];
        
        Set<Integer> leftSet = new HashSet<>();
        Set<Integer> rightSet = new HashSet<>();
        
        for (int i = 0; i < n; ++i) {
            leftSet.add(topping[i]);
            leftCount[i] = leftSet.size();
        }
        
        for (int i = n - 1; i >= 0; --i) {
            rightSet.add(topping[i]);
            rightCount[i] = rightSet.size();
        }
        
        int fairCuts = 0;
        
        for (int i = 0; i < n - 1; ++i) {
            if (leftCount[i] == rightCount[i + 1]) {
                fairCuts++;
            }
        }
        
        return fairCuts;
    }
    

}
