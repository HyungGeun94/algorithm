class Solution {
    public int solution(int n) {
        int answer = 0;
        
        long zero=0;
        long first=1;
        long second=0;
        
        for(int i=2; i<n; i++){
            
            second=(zero+first)%1234567;
            
            zero=first;
            first=second;
        }
        
        return (int)(zero+first)%1234567;
    }
}