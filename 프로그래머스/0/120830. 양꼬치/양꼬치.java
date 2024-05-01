class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int count=0;
        count=n/10;
        
        
        answer=12000*n+k*2000-2000*count;
        return answer;
    }
}