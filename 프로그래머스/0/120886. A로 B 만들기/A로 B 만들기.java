import java.util.*;

class Solution {
    public int solution(String before, String after) {
        char[] chArr1 = before.toCharArray();
        char[] chArr2 = after.toCharArray();
        
        Arrays.sort(chArr1);
        Arrays.sort(chArr2);
        return Arrays.equals(chArr1,chArr2) ? 1: 0;
    }
}