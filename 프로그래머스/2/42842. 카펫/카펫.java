class Solution {
    public int[] solution(int brown, int yellow) {
        
        
        for(int i=brown; i>=1; i--){
            
            for(int j=1; j<=brown+yellow; j++){
                
                if(i*j==brown+yellow && brown  == i*2+2*j-4) {    
                    
                    return new int[]{i,j};
                }
            }
        }
        
        
        return new int[]{};
    }
}