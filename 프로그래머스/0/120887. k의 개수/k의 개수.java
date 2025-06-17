class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int s=i; s<=j; s++){
            
            String str = String.valueOf(s);
            
            for(char ch : str.toCharArray()){
                
                if(ch-'0'==k){
                    answer++;
                }
                
            }
            
        }
        
        return answer;
    }
}