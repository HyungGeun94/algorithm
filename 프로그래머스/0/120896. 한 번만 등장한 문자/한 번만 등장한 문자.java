import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return map.entrySet().stream()
          .filter(entry -> entry.getValue() == 1)
          .map(entry -> entry.getKey())
          .sorted()
          .map(c -> String.valueOf(c))
          .collect(Collectors.joining());
    }
}