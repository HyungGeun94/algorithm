class Solution {
    public int solution(int n) {
        int answer = 0;
        int factorial = 1;
        
        while(true){
            
            answer++;
            
            factorial*=answer;
            
            if(factorial>n){
                break;
            }
            
        }
        
        
        
        return --answer;
    }
}