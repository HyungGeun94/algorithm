import java.util.Arrays;

class Solution {
    public int[] solution(int[] numList, int n) {
        return Arrays.stream(numList)
                     .skip(n - 1) 
                     .toArray();
    }
}