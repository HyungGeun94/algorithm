import java.util.Arrays;


class Solution {
    public long solution(long n) {
        
        String[] strArr = (n+"").split("");
        
        Arrays.sort(strArr);
        
        StringBuffer sb = new StringBuffer(String.join("",strArr));

        
        
        
        return Long.parseLong(sb.reverse().toString());
    }
}