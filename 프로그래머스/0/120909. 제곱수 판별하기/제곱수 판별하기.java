class Solution {
    public int solution(int n) {
        return (double)n == (double)((int)Math.sqrt(n) * (int)Math.sqrt(n)) ? 1 : 2;
    }
}