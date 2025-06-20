class Solution {
    public int solution(int a, int d, boolean[] included) {
        int dsum = 0;
        int idxsum =0;
        
        for(int i=0; i<included.length; i++){
            
            if(included[i]){
                dsum+=i;
                idxsum++;
            }
            
        }
        
        return idxsum*a + dsum*d;
    }
}