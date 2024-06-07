import java.util.regex.Pattern;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        Pattern pattern = Pattern.compile("^(aya|ye|woo|ma)+$");
        
        for (String word : babbling) {
            if (pattern.matcher(word).matches()) {
                answer++;
            }
        }
        
        return answer;
    }
}
