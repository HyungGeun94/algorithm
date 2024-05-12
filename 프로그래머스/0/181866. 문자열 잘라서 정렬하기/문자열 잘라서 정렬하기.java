import java.util.*;

class Solution {
    public String[] solution(String myString) {
        List<String> list = new ArrayList<>();
        String[] parts = myString.split("x+");
        for (String part : parts) {
            if (!part.isEmpty()) {
                list.add(part);
            }
        }
        
        Collections.sort(list);
        
        return list.toArray(new String[0]);
    }
}