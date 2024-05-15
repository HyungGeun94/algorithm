class Solution {
    public int solution(int n) {
        
        int answer=0;
        
        for(int i=1; i<9999; i++){
            int pizza =6*i;
                        
            
            if(pizza%n==0){
                answer=pizza/6;
                break;
            }
            
            
        }
      
        return answer;
        
    }
}