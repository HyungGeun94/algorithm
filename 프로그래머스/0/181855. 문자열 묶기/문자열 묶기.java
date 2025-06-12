import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> lengthCount = new HashMap<>();

        for (String s : strArr) {
            int len = s.length();
            lengthCount.put(len, lengthCount.getOrDefault(len, 0) + 1);
        }

        int max = 0;
        for (int count : lengthCount.values()) {
            max = Math.max(max, count);
        }

        return max;
    }
}