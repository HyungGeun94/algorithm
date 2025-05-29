import java.util.*;

class Solution {
    public int solution(String my_string) {
        return (int) Arrays.stream(my_string.split(""))
            .filter(str -> str.charAt(0)>='0' && str.charAt(0)<='9')
            .mapToInt(num -> Integer.parseInt(num))
            .sum();
        
    }
}