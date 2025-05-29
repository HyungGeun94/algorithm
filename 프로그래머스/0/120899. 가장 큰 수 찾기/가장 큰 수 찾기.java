import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();
        int idx = IntStream.range(0, array.length)
                    .filter(i -> array[i] == max)
                    .findFirst().getAsInt();
        return new int[]{max, idx};
    }
}