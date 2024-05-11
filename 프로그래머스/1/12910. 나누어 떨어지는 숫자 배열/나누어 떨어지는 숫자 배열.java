import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] arr2 = Arrays.stream(arr).filter(i-> i%divisor==0).sorted().toArray();
        return arr2.length ==0 ? new int[]{-1} : arr2;

    }
}