class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        int x = box[0];
        int y = box[1];
        int z = box[2];
        
        if(x<n || y < n || z <n ){
            
        return answer;    
        }
        
        
        
        
        
        return (x/n) *(y/n) * (z/n);
    }
}