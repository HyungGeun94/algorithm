import java.util.*;

class Solution {
    public int solution(String before, String after) {
        char[] charArray = before.toCharArray();

        Arrays.sort(charArray);

        char[] charArray1 = after.toCharArray();

        Arrays.sort(charArray1);

        return Arrays.equals(charArray,charArray1) ? 1 : 0;
    }
}