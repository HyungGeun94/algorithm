class Solution {
    public int solution(String my_string) {
        int sum = 0;
        StringBuilder number = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (Character.isDigit(ch)) { 
                number.append(ch);
            } else { 
                if (number.length() > 0) {
                    sum += Integer.parseInt(number.toString());
                    number.setLength(0); 
                }
            }
        }

        if (number.length() > 0) {
            sum += Integer.parseInt(number.toString());
        }

        return sum;
    }
}