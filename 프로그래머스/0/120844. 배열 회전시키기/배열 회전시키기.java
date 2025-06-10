import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> list = new ArrayList<>();
        for (int num : numbers) list.add(num);

        if (direction.equals("right")) {
            Collections.rotate(list, 1);
        } else {
            Collections.rotate(list, -1);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}