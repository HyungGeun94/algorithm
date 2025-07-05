class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int start = 1; start <= n; start++) {
            int sum = 0;
            for (int next = start; sum < n; next++) {
                sum += next;
                if (sum == n) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}