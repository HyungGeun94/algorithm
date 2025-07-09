import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;

        Set<Integer> leftSet = new HashSet<>();
        Map<Integer, Integer> rightMap = new HashMap<>();

        for (int t : topping) {
            rightMap.put(t, rightMap.getOrDefault(t, 0) + 1);
        }

        for (int i = 0; i < topping.length; i++) {
            int current = topping[i];

            leftSet.add(current);

            rightMap.put(current, rightMap.get(current) - 1);
            if (rightMap.get(current) == 0) {
                rightMap.remove(current);
            }

            if (leftSet.size() == rightMap.size()) {
                answer++;
            }
        }

        return answer;
    }
}