import java.util.*;

class Solution {
    public long solution(long n) {

        String str = n+"";

        Character[] charArray = new Character[str.length()];

        for(int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }

        Arrays.sort(charArray,Collections.reverseOrder());

        StringBuffer sb = new StringBuffer();
        
        for(char c : charArray) {
            sb.append(c);
        }
        
        return Long.parseLong(sb.toString());
    }
}