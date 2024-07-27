class Solution {
    public int solution(int n) {
        
        
        int answer = 1;
        
        int num=1;
        
        while(true){
            
            if(answer*num<=n){
                
                
            
                answer*=num;
                
                num++;
                
                
            }else{
                answer=num-1;
                break;
                
            }
         
        }
        
        
        
        return answer;
    }
}