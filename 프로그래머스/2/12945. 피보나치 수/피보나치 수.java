class Solution {
    public int solution(int n) {
        
        long num0=0;
        long num1=1;
        long num2=num0+num1;        
        
        for(int i=2; i<=n; i++){
            
            num2=(num0 + num1) % 1234567;  
            num0=num1;
            num1=num2;
        }
        
        return (int)(num2%1234567);
    }
}