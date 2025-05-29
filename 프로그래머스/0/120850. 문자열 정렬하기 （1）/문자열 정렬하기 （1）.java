import java.util.*;

class Solution {
    public int[] solution(String my_string) {
         return Arrays.stream(my_string.split(""))
                .filter(string ->string.charAt(0)>='0' && string.charAt(0)<='9')
                .mapToInt(num -> Integer.parseInt(num)).sorted().toArray();
    }
}