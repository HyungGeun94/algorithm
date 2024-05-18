import java.util.*;

public class Solution {
    public static int[] solution(int[] arr, int k) {
        
        List<Integer> uniqueNumbers = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (!seen.contains(num)) {
                seen.add(num);
                uniqueNumbers.add(num);
            }
            if (uniqueNumbers.size() == k) {
                break;
            }
        }

        int[] result = new int[k];
        int i = 0;
        for (; i < uniqueNumbers.size(); i++) {
            result[i] = uniqueNumbers.get(i);
        }

        for (; i < k; i++) {
            result[i] = -1;
        }

        return result;
    }
}
