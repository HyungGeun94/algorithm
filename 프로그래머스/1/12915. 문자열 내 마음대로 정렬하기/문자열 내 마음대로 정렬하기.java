import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] extracted = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            extracted[i] = strings[i].charAt(n) + strings[i];
        }
        
        Arrays.sort(extracted);
        
        for (int i = 0; i < extracted.length; i++) {
            extracted[i] = extracted[i].substring(1);
        }
        
        return extracted;
    }
}
