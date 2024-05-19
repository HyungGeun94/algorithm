class Solution {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        
        // 공백도 포함하여 분리하는 정규식 사용
        String[] words = s.split("(?<=\\s)|(?=\\s)");
        
        for (String word : words) {
            StringBuilder transformedWord = new StringBuilder();
            
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                if (j % 2 == 0) {
                    transformedWord.append(Character.toUpperCase(c));
                } else {
                    transformedWord.append(Character.toLowerCase(c));
                }
            }
            
            result.append(transformedWord);
        }
        
        return result.toString();
    }
}