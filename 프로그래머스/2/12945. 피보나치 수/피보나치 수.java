class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int f_0 = 0;
        int f_1 = 1;
        int f_2 = f_0+f_1;
        
        
        for(int i=3; i<=n; i++){
            f_0=f_1;
            f_1=f_2;
            f_2 = (f_0+f_1)%1234567;
            
        }
        
        return f_2;
    }
}