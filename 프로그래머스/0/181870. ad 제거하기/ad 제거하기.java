import java.util.Arrays;


class Solution {
    public String[] solution(String[] strArr) {
        
       String[] array = Arrays
           .stream(strArr)
           .filter(i -> !i.contains("ad"))
           .toArray(size -> new String[size]);
        
        
        return array;
    }
}