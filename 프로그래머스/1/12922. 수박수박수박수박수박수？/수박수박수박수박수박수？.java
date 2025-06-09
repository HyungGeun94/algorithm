class Solution {
    public String solution(int n) {
        String answer = "수박";
        return answer.repeat(n/2) + (n % 2 ==0 ? "" : "수");
    }
}