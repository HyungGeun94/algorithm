class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for(long i=0; i<answer.length; i++){
            
            answer[(int)i] = x+x*i;
            
        }
        
        
        return answer;
    }
}