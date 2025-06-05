import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int[] intArr = Arrays.stream(arr).filter(num -> num%divisor==0).sorted().toArray();
        
        return intArr.length==0 ? new int[]{-1} : intArr;
    }
}