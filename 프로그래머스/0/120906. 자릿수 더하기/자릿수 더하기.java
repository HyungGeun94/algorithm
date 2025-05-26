class Solution {
    public int solution(int n) {
        String s = n+"";
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += c - '0';
        }
        return sum;
    }
}