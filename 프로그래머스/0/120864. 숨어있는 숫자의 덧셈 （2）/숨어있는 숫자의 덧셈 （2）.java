class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuilder number = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (Character.isDigit(ch)) { // 숫자인 경우
                number.append(ch);
            } else { // 숫자가 아닌 경우
                if (number.length() > 0) {
                    answer += Integer.parseInt(number.toString());
                    number.setLength(0); // 숫자를 담은 StringBuilder 초기화
                }
            }
        }

        // 마지막 숫자 처리
        if (number.length() > 0) {
            answer += Integer.parseInt(number.toString());
        }

        return answer;
    }
}
