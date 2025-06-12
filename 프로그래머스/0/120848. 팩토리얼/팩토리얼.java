class Solution {
    public int solution(int n) {
        
       int answer=1;
        for(int i=2; i<=11; i++){
            
            answer = answer*i;
            
            if(answer>n){
                return i-1;
            }
            
            
            }
        return answer;
    }
}