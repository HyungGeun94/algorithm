class Solution {
    public int solution(int slice, int n) {
        
        int answer=1;
        int plus=slice;
        
        while(slice<n){
            
            slice+=plus;
            answer++;
            
        }
        
        
        return answer;

    }
}