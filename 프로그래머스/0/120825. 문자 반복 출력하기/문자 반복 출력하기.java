class Solution {
    public String solution(String my_string, int n) {
        
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<my_string.length(); i++){
            
            char ch = my_string.charAt(i);
            
            for(int j=0; j<n; j++){
            
                sb.append(ch);
            }            
            
        }
        
        
        return sb.toString();
    }
}