import java.util.Arrays;

class Solution {
    public String solution(String[] str_list, String ex) {
        return Arrays.stream(str_list)
                      .filter(str -> !str.contains(ex))
                      .reduce("", (a, b) -> a + b);
    }
}