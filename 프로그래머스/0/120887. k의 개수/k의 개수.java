class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        
        for(int z=i; z<=j; z++){
            
            String str = z+"";
            
            for(int x=0; x<str.length(); x++){
                
                if(str.charAt(x)-'0'==k){
                    answer++;
                }
            }
            
        }
        
        
        
        return answer;
    }
}