class Solution {
     public static int solution(String[] babbling) {
        int answer = 0;
        String[] len = new String[]{"aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < len.length; j++) {
                babbling[i] = babbling[i].replace(len[j], " ");
            }

            if ("".equals(babbling[i].trim())){
                answer = answer + 1;
            }
        }
        return answer;
    }


}