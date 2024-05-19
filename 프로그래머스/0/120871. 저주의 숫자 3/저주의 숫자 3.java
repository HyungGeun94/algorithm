class Solution {
    public int solution(int n) {
        int maul = 0;
        
        for(int i=1; i<=n;){
            maul++;
            if(maul%3!=0 && !((maul+"").contains("3"))){
                
                 i++;
            }
            
        }
        
        
        return maul;
    }
}