import java.util.*;


class Solution {
    public int[] solution(int l, int r) {
        
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            String str = i+"";
            if (str.matches("[05]+")) {
                result.add(i);
            }
        }

        if (result.isEmpty()) {
            return new int[]{-1};
        } else {
            int[] answer = new int[result.size()];
            for (int i = 0; i < result.size(); i++) {
                answer[i] = result.get(i);
            }
            return answer;
        }
    }
}