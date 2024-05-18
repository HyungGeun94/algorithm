import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (stk.isEmpty() || stk.get(stk.size() - 1) < arr[i]) {
                stk.add(arr[i]);
            } else {
                stk.remove(stk.size() - 1);
                i--; // 현재 인덱스를 다시 검사하기 위해 감소
            }
        }

        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}