class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        
        for(int i=0; i<code.length(); i++){
            
            answer+= i%q==r ? code.charAt(i) : "";
            
        }
        
        
        return answer;
    }
}