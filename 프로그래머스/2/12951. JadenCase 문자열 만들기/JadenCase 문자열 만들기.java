class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isFirstCharOfWord = true;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer.append(" ");
                isFirstCharOfWord = true;
            }
            else {
                if (isFirstCharOfWord) {
                    answer.append(Character.toUpperCase(c));
                    isFirstCharOfWord = false;
                }
                else {
                    answer.append(Character.toLowerCase(c));
                }
            }
        }

        return answer.toString();
    }
}
