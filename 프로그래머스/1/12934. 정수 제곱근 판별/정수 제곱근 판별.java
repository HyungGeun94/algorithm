class Solution {
    public long solution(long n) {
        long answer = 0;
        
        long l = (long)(Math.sqrt(n));
        
        
        
        return l * l == n ? (l+1)*(l+1) : -1;
    }
}