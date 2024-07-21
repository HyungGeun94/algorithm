class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=4; i<=n; i++){
            
            int yaksu =0;
            for(int j=1; j<=Math.sqrt(i); j++){
                
                if(i%j==0){
                    yaksu+=2;
                    if(Math.sqrt(i)==j){
                        yaksu--;
                    }
                }
                
            }
            if(yaksu>=3){
                answer++;
            }
            
        }
        
        
        return answer;
    }
}