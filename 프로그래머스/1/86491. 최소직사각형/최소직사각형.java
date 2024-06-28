class Solution {
    public int solution(int[][] sizes) {
        
        int x=0;
        int y=0;
        
        
        for(int i=0; i<sizes.length; i++){
            
            int max = sizes[i][0] > sizes[i][1] ? sizes[i][0] : sizes[i][1];
            int min = sizes[i][0] < sizes[i][1] ? sizes[i][0] : sizes[i][1];
            
            x = max > x ? max : x ;
            y = min > y ? min : y ; 
            
            
            
            
        }
        
        return x*y;
    }
}